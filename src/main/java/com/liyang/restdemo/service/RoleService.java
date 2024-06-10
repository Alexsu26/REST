package com.liyang.restdemo.service;

import com.liyang.restdemo.entity.Role;
import com.liyang.restdemo.entity.RoleParams;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleService {
    @Select("select * from roles where id = #{id}")
    Role getRole(@Param("id") long id);

    @Select("select * from roles limit #{roleParams.start}, #{roleParams.limit}")
    List<Role> findRoles(@Param("roleParams") RoleParams roleParams);

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into roles (name, note) values (#{role.name}, #{role.note})")
    int insertRole(@Param("role") Role role);

    @Update("update roles set name = #{role.name}, note = #{role.note} where id = #{role.id}")
    int updateRole(@Param("role") Role role);

    @Delete("delete from roles where id = #{id}")
    int deleteRole(@Param("id")long id);
}

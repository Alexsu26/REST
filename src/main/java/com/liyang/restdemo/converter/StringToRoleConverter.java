package com.liyang.restdemo.converter;

import com.liyang.restdemo.entity.Role;
import org.springframework.core.convert.converter.Converter;

public class StringToRoleConverter implements Converter<String, Role> {

    @Override
    public Role convert(String source) {
        if (source == null) {
            return null;
        }
        if (source.indexOf("-") == -1) {
            return null;
        }
        String[] arr = source.split("-");
        if (arr.length != 3) {
            return null;
        }
        Role role = new Role();
        role.setId(Long.parseLong(arr[0]));
        role.setName(arr[1]);
        role.setNote(arr[2]);
        return role;
    }
}

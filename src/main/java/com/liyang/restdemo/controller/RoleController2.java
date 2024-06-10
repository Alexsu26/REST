package com.liyang.restdemo.controller;

import com.liyang.restdemo.entity.ResultMessage;
import com.liyang.restdemo.entity.Role;
import com.liyang.restdemo.service.RoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/role2")
public class RoleController2 {
    @Autowired
    private RoleService roleService = null;

    @GetMapping("/page")
    public ModelAndView page() {
        return new ModelAndView("restful");
    }

    @GetMapping("info/{id}")
    public Role getRole(@PathVariable("id") Long id ) {
        return roleService.getRole(id);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResultMessage newRole(@RequestBody Role role) {
        Integer result = roleService.insertRole(role);
        if (result > 0) {
            return new ResultMessage(
                    true, "新增角色成功，编号为：" + role.getId()
            );
        }
        return new ResultMessage(
                false, "新增角色失败！"
        );
    }

    @PutMapping("/")
    public ResultMessage updateRole(@RequestBody Role role) {
        Integer result = roleService.updateRole(role);
        if (result > 0) {
            return new ResultMessage(
                    true, "修改角色成功，编号为：" + role.getId()
            );
        }
        return new ResultMessage(
                false, "修改角色失败!"
        );
    }

    @DeleteMapping("/{id}")
    public ResultMessage deleteRole(@PathVariable("id") Long id) {
        Integer result = roleService.deleteRole(id);
        if (result > 0) {
            return new ResultMessage(
                    true, "删除角色成功，编号为：" + id
            );
        }
        return new ResultMessage(
                false, "删除角色失败!"
        );
    }
}

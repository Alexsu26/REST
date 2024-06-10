package com.liyang.restdemo.controller;

import com.liyang.restdemo.entity.Role;
import com.liyang.restdemo.exception.RoleException;
import com.liyang.restdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService = null;

    @ModelAttribute("role")
    public Role initRole(@PathVariable(value = "id", required = false) Long id) {
        if (id == null || id < 1) {
            return null;
        }
        Role role = roleService.getRole(id);
        return role;
    }

    @GetMapping("/info/{id}")
    public Role getRole(@ModelAttribute("role") Role role) {
        return role;
    }

    @GetMapping("/found/{id}")
    public Role notFound(@PathVariable("id") Long id) {
        Role role = roleService.getRole(id);
        if (role == null) {
            throw new RoleException();
        }
        return role;
    }

    @ExceptionHandler(RoleException.class)
    @ResponseStatus(
            code = HttpStatus.NOT_FOUND,
            reason = "找不到角色信息！")
    public void handleRoleException(RoleException e) {}

}

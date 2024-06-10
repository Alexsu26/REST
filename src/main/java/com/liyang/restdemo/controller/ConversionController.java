package com.liyang.restdemo.controller;

import com.liyang.restdemo.entity.Role;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/converter")
public class ConversionController {

    @GetMapping("/{role}")
    public Role convert(@PathVariable("role") Role role) {
        return role;
    }

    @GetMapping("/roles/{infoes}")
    public List<Role> convertList(@PathVariable("infoes") List<Role> roleList) {
        return roleList;
    }

    @GetMapping("/page")
    public ModelAndView page() {
        return new ModelAndView("formatter");
    }

    @PostMapping("/formatter")
    public Map<String, Object> formater(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date,
            @RequestParam("amount") @NumberFormat(pattern = "#,###.##") Double amount
    ) {
        Map<String, Object> result = new HashMap<>();
        result.put("date", date);
        result.put("amount", amount);
        return result;
    }
}

package com.liyang.restdemo.client;

import com.liyang.restdemo.entity.Role;
import org.springframework.web.client.RestTemplate;

public class RestTemplateDemo {
    private static RestTemplate restTemplate = new RestTemplate();

    private static String baseUrl
            = "localhost:8080/rest";

    public static void main(String[] args) {
        testGet();
    }

    private static void testGet() {
        String url = baseUrl + "/role2/info/{id}";

        Role role = restTemplate.getForObject(url, Role.class, 1L);
        System.out.println(role.getName());
    }
}

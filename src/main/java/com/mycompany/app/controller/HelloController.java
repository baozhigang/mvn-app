package com.mycompany.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.app.domain.Hello;
import com.mycompany.app.mapper.HelloMapper;

/**
 * HelloController
 */
@RestController
public class HelloController {

    private final HelloMapper helloMapper;

    @Autowired
    public HelloController(HelloMapper helloMapper) {
        this.helloMapper = helloMapper;
    }

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable Long id) {
        Hello hello = this.helloMapper.findOneById(id);
        if (null == hello) {
            return "hello not found";
        }

        return hello.toString();
    }
}
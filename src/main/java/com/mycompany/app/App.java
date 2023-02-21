package com.mycompany.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 入口文件
 *
 */
@SpringBootApplication
@RestController
@MapperScan("com.mycompany.app.mapper")
public class App
{
    public static void main( String[] args ) throws IOException
    {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

}

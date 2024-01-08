package com.lyp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:BookController
 * Package:com.lyp.controller
 * Description:
 *
 * @Author:lyp
 * @Create:2024/1/7 - 17:35
 * @Version: v1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("springboot is running");
        return "springboot is running";
    }
}

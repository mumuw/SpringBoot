package com.lin.controller;

import com.lin.config.AuthorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private AuthorConfig authorConfig;

    @RequestMapping("/")
    public String testConfigurationProperties(){
        return authorConfig.getName() + authorConfig.getAge();
    }
}

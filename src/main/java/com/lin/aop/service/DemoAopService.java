package com.lin.aop.service;

import com.lin.aop.LogPrint;
import org.springframework.stereotype.Service;

@Service
public class DemoAopService {

    @LogPrint
    public void add(){
        System.out.println("add main");
    }
}

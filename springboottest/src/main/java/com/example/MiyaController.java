package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miracle_wzx
 * @Package com.example.demo
 * @Description:
 * @date 2018/5/7下午2:07
 */
@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }

}
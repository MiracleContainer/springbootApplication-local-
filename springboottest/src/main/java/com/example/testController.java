package com.example;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author miracle_wzx
 * @Package com.example.demo
 * @Description:
 * @date 2018/5/7上午10:36
 */

@RestController
public class testController {


   // @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

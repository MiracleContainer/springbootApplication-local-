package com.example;

import com.example.Entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author miracle_wzx
 * @Package com.example
 * @Description:
 * @date 2018/5/7下午4:48
 */
@Controller
public class GreetingController {


    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting",new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

}

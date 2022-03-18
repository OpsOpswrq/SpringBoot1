package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class HelloController1 {
    @RequestMapping("/t1")
    @ResponseBody
    public String test1(){
        return "HelloSpringBoot";
    }
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","<h1>HelloSpringBoot</h1>");
        model.addAttribute("users", Arrays.asList("feng<br>","helo"));
        return "Hello";
    }
    @RequestMapping("/t3")
    public String test3(){
        return "test";
    }
}

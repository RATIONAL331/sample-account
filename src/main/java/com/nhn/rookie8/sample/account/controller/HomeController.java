package com.nhn.rookie8.sample.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/account")
    @ResponseBody
    public String home(){
        return "hello!";
    }
}

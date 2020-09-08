package com.example.demo.controllers;

import com.example.demo.services.Fredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    @GetMapping("/friday")
    @ResponseBody
    public String friday(){
        Fredag fredag = new Fredag();
        return fredag.friday();
    }



}
package com.imooc.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf-imooc");
        return "thymeleaf/index";
    }

}

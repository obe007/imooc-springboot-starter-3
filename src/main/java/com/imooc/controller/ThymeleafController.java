package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody
@RequestMapping("/")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name","thymeleaf-imho");
        return "thymeleaf/index";
    }

}

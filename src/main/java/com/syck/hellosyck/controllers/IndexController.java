package com.syck.hellosyck.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/hood")
    public String hood(){
        return "hood";
    }


}

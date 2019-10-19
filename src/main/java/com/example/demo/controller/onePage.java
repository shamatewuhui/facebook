package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class onePage {

    @RequestMapping(path = {"/"}, method = {RequestMethod.GET})
    @ResponseBody
    public String index() {
        return "heool world";
    }

    @RequestMapping(path = {"/vm"}, method = {RequestMethod.GET})
    public String template() {
        return "HomePod ";
    }



}

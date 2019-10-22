package com.example.demo.controller;

import com.example.demo.model.User;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;


//@Controller
public class onePage {

    private static final Logger logger= LoggerFactory.getLogger(onePage.class);
    @RequestMapping(path = {"/"}, method = {RequestMethod.GET})
    @ResponseBody

    public String index(HttpSession httpSession) {


        logger.info("说你爱我 ");
        return "heool world"+httpSession.getAttribute("msg");
    }

   /*
    @RequestMapping(path = {"/vm"}, method = {RequestMethod.GET})
    public String template() {

        return "HomePod";
    }
    */

    @RequestMapping(path = {"/v"}, method = {RequestMethod.GET})
    public String model(Model model) {
        model.addAttribute("value1", "vvvvvvvvv");
        List<String> colors = Arrays.asList(new String[]{"red", "blue ", "black"});
        model.addAttribute("colors", colors);
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        model.addAttribute("map", map);
        model.addAttribute("user", new User("sss"));
        return "home";
    }
/*
    @RequestMapping(path = {"/request"}, method = {RequestMethod.GET})
    @ResponseBody
    public String request(Model model, HttpServletResponse response,
                          HttpServletRequest request,
                          HttpSession session
    ) {

        StringBuilder sb = new StringBuilder();
        sb.append(request.getMethod() + "<br>");
        response.addCookie(new Cookie("ss", "ddd"));
        return sb.toString();

    }
*/
/*
    @RequestMapping(path = {"/redirect/{code}"}, method = {RequestMethod.GET})


    public String redirect(@PathVariable("code") int code ,
                           HttpSession httpSession
                           ) {
        httpSession.setAttribute("msg","ssssdddd");
        return "redirect:/";
    }
*/
}

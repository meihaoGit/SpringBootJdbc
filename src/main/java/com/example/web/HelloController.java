package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 3111266 on 2016/04/05.
 * com.example.web
 */
@Controller
@RequestMapping("/")
public class HelloController {

    public HelloController() {
    }

    @RequestMapping
    @ResponseBody
    public String index() {

        return "これは  /test のページです。";
    }
}

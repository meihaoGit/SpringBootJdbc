package com.example.web;

import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 3111266 on 2016/04/06.
 * com.example.web
 */
@Controller
@RequestMapping("/user")
public class UserController {
    final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    public UserController() {

    }

    @RequestMapping
    @ResponseBody
    public String index() {
        logger.info("UserController index user のページ.");
        String userName = userService.getUserName();
        return "これは  /user のページです。" + userName;
    }
}

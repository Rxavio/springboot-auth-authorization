package net.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public String basicLoginDetails(){
        return  "Welcome Logged in user";
    }

    @RequestMapping("/homepage")
    @ResponseBody
    public String homepageDetails(){
        return  "Welcome Logged in - access to all users ";
    }

    @RequestMapping("/adminPage")
    @ResponseBody
    public String adminHomepageDetails(){
        return  "Welcome Logged in admin page - priviledged by  ADMIN ";
    }


    @RequestMapping("/userHomePage")
    @ResponseBody
    public String userHomepageDetails(){
        return  "Welcome Logged in - priviledged by USERS ";
    }

}


package com.ck.onlinelearning.controller;

import com.ck.onlinelearning.entity.User;
import com.ck.onlinelearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if (user == null|| user.getName() == null || user.getPassword() == null) {
            return "user/login.html";
        }
        User login = userService.login(user);
        if (login== null) {
            model.addAttribute("message","登录失败");
        }else {
            model.addAttribute("message","登录成功");
            session.setAttribute("user",login);
            return "redirect:/";
        }
        return "message.html";
    }
    @PostMapping("/register")
    public String register(User user,  Model model) {
        //if user is null
        if (user == null|| user.getName() == null || user.getPassword() == null) {
            return "register.html";
        }
        //if nickname is null set nickname is name
        if(user.getNickname()== null || user.getNickname().length()== 0){
            user.setNickname(user.getName());
        }
        //user give to userservice
        int register = userService.register(user);
        //get the return number
        if (register== 0) {
            model.addAttribute("message","注册失败");
        }else {
            model.addAttribute("message","注册成功");
            return "redirect:/login";
        }
        return "message.html";
    }
    @GetMapping("/")
    public String main(){
        return "main.html";
    }
    @GetMapping("login")
    public String login(){
        return "user/login.html";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("power", userService.getAllPower());
        return "user/register.html";
    }
}





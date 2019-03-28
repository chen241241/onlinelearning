package com.ck.onlinelearning.controller;

import com.ck.onlinelearning.entity.User;
import com.ck.onlinelearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
        return "index.html";
    }
    @GetMapping("login")
    public String login(){
        return "user/login.html";
    }

    @GetMapping("/js/bodyTab.js")
    public String jsbodyTab() {
        return "redirect:/static/js/bodyTab.js";
    }

    @GetMapping("/page/main.html")
    public String page() {
        return "page/main.html";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("power", userService.getAllPower());
        return "user/register.html";
    }

//    @GetMapping("/**/{a}/{b}")
//    public String test(@PathVariable("a") String a,@PathVariable("b") String b) {
//        return "/static/"+a+"/"+b;
//    }
//    @RequestMapping(value = "/page/{a}/{b}",method = RequestMethod.GET)
//    public String repage(@PathVariable("a") String a,@PathVariable("b") String b) {
//        return "/page/"+a+"/"+b;
//    }
    @GetMapping("/page/**")
    public String repage(HttpServletRequest request) {
        return request.getRequestURI();
    }
    @GetMapping("/page/**/**.js")
    public String repagestatic(HttpServletRequest request) {
        return "redirect:/static"+request.getRequestURI();
    }

    @GetMapping("/css/**")
    public String cssstatic(HttpServletRequest request) {
        return "redirect:/static"+request.getRequestURI();
    }
    @GetMapping("/images/**")
    public String imagesstatic(HttpServletRequest request) {
        return "redirect:/static"+request.getRequestURI();
    }
    @GetMapping("/js/**")
    public String jsstatic(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "redirect:/static"+request.getRequestURI();
    }
    @GetMapping("/json/**")
    public String jsonstatic(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "redirect:/static"+request.getRequestURI();
    }
//
    @GetMapping("/layui/**")
    public String layuistatic(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "redirect:/static"+request.getRequestURI();
    }

}





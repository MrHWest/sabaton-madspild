package com.sabaton.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/")
    public String home() {
        return "madspildHovedside";
    }
    @GetMapping("/article")
    public String article() {
        return "article";
    }
    @GetMapping("/article0")
    public String article0() {
        return "article0";
    }
    @GetMapping("/article1")
    public String article1() {
        return "article1";
    }
    @GetMapping("/article2")
    public String article2() {
        return "article2";
    }
    @GetMapping("/article3")
    public String article3() {
        return "article3";
    }
    @GetMapping("/article4")
    public String article4() {
        return "article4";
    }
    @GetMapping("/article5")
    public String article5() {
        return "article5";
    }
    @GetMapping("/article6")
    public String article6() {
        return "article6";
    }
    @GetMapping("/info")
    public String info() {
        return "info";
    }
    @GetMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

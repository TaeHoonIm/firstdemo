package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board")
    public String home(){
        return "board";
    }
    @GetMapping("/boardWrite")
    public String boardWrite(){
        return "boardWrite";
    }

    @GetMapping("/boardContent")
    public String boardContent(){
        return "boardContent";
    }
}

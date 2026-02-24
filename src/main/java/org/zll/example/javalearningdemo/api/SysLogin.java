package org.zll.example.javalearningdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
public interface SysLogin {

    @PostMapping("/login")
    String login();

    @GetMapping("/selfInfo")
    String selfInfo();
}

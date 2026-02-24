package org.zll.example.javalearningdemo.api.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.zll.example.javalearningdemo.api.SysLogin;

@RestController
@Slf4j
public class SysLoginController implements SysLogin {

    @Override
    public String login() {
        return "";
    }

    @Override
    public String selfInfo() {
        return "";
    }
}

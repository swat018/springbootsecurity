package com.swat018.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hellop() {
        return "hello";
    }

    @GetMapping("/my")
    public String my() {
        return "my";
    }
}

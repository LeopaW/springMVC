package com.xa.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baby")
public class BabyController {

    @RequestMapping("/hello")
    public String greet(){

        System.out.println("baby hello");
        return "forward";
    }
}

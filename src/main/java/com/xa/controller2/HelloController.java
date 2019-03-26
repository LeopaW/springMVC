package com.xa.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    //转发到页面 默认的选项
    //重定向到页面 redirect:path
    //转发到另一个控制器 forward:path


    //转发
    @RequestMapping("/forward")
    public String forward(Model model){
        //springMVC model默认上在请求域当中存储值
        System.out.println("111");
        model.addAttribute("skill","睡觉");
        return "forward";
    }

    //重定向
    @RequestMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("skill","煮饭");
        System.out.println("2222");
//       不带斜杠的写法是一个相对路径,根据当前上下文决定,
//       如果是重定向,就跟视图解析的规则无关
        return "redirect:/jsp2/redirect.jsp";
    }


    @RequestMapping("/forward2")
    public String forwardAnontherController(){

        return "forward:/baby/hello";
    }
}

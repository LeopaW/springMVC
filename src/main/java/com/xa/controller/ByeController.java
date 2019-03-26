package com.xa.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//不需要继承任何类,或者实现任何接口
@Controller
@RequestMapping("/bye")
public class ByeController {

    // ModelAndView
    @RequestMapping("/bye")
    public String bye(Model model){
        model.addAttribute("model","modeller");
        //这里return的就是那个viewName
        //此时去的是/jsp/bye.jsp页面
        return "bye";
    }

    /*
    1.记得配置一个基础扫描的包,这样配置的注解才会生效
    2.在指定的类上面调价@Controller注解
    3.调价@RequestMapping,类似于前面的controller的那个名字


    当我们写上Controller之后,就标记了它为spring的一个组件,并且是控制器的组件,此时我们的
    handlermapping回去扫描寻找这个controller是否与之匹配,如果发现匹配就把任务交给它

    匹配的规则是通过
    @RequestMapping(URI)
    通过这个URI进行匹配

    @RequestMapping
    可以写在方法上
    也可以类上(推荐使用二者结合的)
     */

    @RequestMapping("/goodBye")
    public String goodBye(Model model){
        model.addAttribute("boy","心机男孩");
        return "bye";
    }



}

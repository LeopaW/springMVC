package com.xa.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
//可以通过模拟的对象完成操作,也可以使用原生的ServletAPI来完成,直接在方法当中入参即可
public class WebElementController {

    //模拟请求
    @RequestMapping("/request")
    public String request(WebRequest request){
        String girl = request.getParameter("girl");
        System.out.println(girl);

        return "forward";
    }



    //原生request
    @RequestMapping("/request2")
    public String request2(HttpServletRequest request){

        System.out.println(request.getParameter("boy"));
        return "forward";
    }

    @RequestMapping("/request3")
    public String request3(HttpSession session){

        session.setAttribute("g","神庙逃亡");
        session.getServletContext().setAttribute("context","宇宙我最帅");
        return "redirect:/jsp2/redirect.jsp";
    }


    //请求映射的路径path可以写多个值
    //value 写的是路径,是一个数组的形式,可以匹配多个路径
    //@RequestMapping(value = {"/m1","/m2"})
    //path是value的别名,二者任选其一,作用一样
    //如果没有method限定,啥请求都可以
    @RequestMapping(path = {"/m1","/m2"},method = RequestMethod.POST)
    public String m1(){

        System.out.println("m1......");
        return "forward";
    }




}

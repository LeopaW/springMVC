package com.xa.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//实现一个Controller接口的方式
//如果一个接口只有一个方法,这种接口叫做函数式接口.

/**
 * 在model中填充数据,然后在具体的视图进行展示
 * 还需要在配置文件当中配置一下这个bean,要取个名字,就用来充当这个请求URI
 * 它就处理一个请求,跟servlet差别不大
 *
 * 注解开发模式:
 *  基于实现接口的方式已经是过去式了,采用注解开发很简单
 * @Controller
 * @RequestMapper
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav  = new ModelAndView();
        mav.addObject("girl","菲菲");
        mav.setViewName("girl");
        return mav;
    }
}

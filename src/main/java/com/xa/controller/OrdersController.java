package com.xa.controller;

import ocm.xa.pojo.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @RequestMapping("/addOrder")
    //返回值类型为String,String就是逻辑的视图名称
    public String addOrder(Model model){
        List<Orders> list = new ArrayList<>();
        Orders o = new Orders();
        o.setId("1");
        o.setName("西米露");
        o.setTotal(33.33);

        Orders o2 = new Orders();
        o2.setId("2");
        o2.setName("牛啊你");
        o2.setTotal(44.33);
        list.add(o);
        list.add(o2);
        model.addAttribute("orders",list);

        return "orders";
    }
}

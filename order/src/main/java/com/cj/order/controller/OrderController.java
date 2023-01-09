package com.cj.order.controller;

import com.cj.common.RespBean;
import com.cj.order.feign.AccountFeign;
import com.cj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public RespBean order(){

        Boolean result = orderService.createOrder("cc", "toy", 2);
        if (result){
           return RespBean.ok("下单成功");
        }else{
            return RespBean.error("下单失败");
        }
    }
}

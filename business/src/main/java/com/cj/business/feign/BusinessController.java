package com.cj.business.feign;

import com.cj.common.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @Autowired
    BusinessService businessService;

    @PostMapping("/order")
    public RespBean order(String account, String productId, Integer count){
        try {
            businessService.purchase();
            return RespBean.ok("下单成功");
        } catch (Exception e) {
            return RespBean.error("下单失败",e.getMessage());
        }
    }
}

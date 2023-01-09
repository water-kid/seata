package com.cj.order.service;

import com.cj.common.RespBean;
import com.cj.order.feign.AccountFeign;
import com.cj.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    AccountFeign accountFeign;

    public Boolean createOrder(String userId,String commodityCode,Integer count){


        RespBean deductResult = accountFeign.deduct(userId, 100D*count);

        int row = orderMapper.addOrder(userId, commodityCode, count, 100D * count);

        if (row > 0 && deductResult.getCode()==200){
            return true;
        }

        throw new RuntimeException("下单失败");
    }
}

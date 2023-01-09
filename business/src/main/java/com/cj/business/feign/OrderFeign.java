package com.cj.business.feign;

import com.cj.common.RespBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("order")
public interface OrderFeign {

    @PostMapping("/order")
    public RespBean order();
}

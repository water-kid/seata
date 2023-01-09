package com.cj.business.feign;

import com.cj.common.RespBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("storage")
public interface StorageFeign {
    @PostMapping("/deductStorage")
    RespBean deductStorage();

}

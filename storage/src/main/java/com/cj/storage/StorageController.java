package com.cj.storage;

import com.cj.common.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    @PostMapping("/deductStorage")
    public RespBean deductStorage(){
        Boolean toy = storageService.deductStock("toy", 2);
        if (toy){
            return RespBean.ok("库存扣减成功");
        }else {

            return RespBean.ok("库存扣减成功");
        }
    }
}

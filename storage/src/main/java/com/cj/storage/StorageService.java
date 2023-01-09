package com.cj.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    @Autowired
    StorageMapper storageMapper;


    public Boolean deductStock(String commodity,Integer count){
        storageMapper.deductStock(commodity,count);

        Integer stock = storageMapper.findStock(commodity);
        if (stock != null && stock >= 0){
            return true;
        }
        throw new RuntimeException("扣减失败");
    }
}

package com.cj.business.feign;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Autowired
    OrderFeign orderFeign;
    @Autowired
    StorageFeign storageFeign;

    @GlobalTransactional
    public void purchase(){
        orderFeign.order();
        storageFeign.deductStorage();
    }
}

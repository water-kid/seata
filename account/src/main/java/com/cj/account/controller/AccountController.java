package com.cj.account.controller;

import com.cj.account.service.AccountService;
import com.cj.common.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/deductAccount")
    public RespBean deduct(String account,Double money){
//        accountService.deductAccount(account,money)
        return RespBean.ok("deduct account 。。。。");
    }
}

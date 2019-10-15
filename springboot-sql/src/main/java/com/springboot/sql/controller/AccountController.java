package com.springboot.sql.controller;

import com.springboot.sql.domain.Account;
import com.springboot.sql.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/10.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") String id){
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")String id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)int money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        Object t=accountService.update(account);
        if((int)t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public  String postAccount(Account account){
        Object t= accountService.add(account);
        if((int)t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }
}

package com.springboot.mybatis.controller;

import com.springboot.mybatis.domain.Account;
import com.springboot.mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/18.
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
    public Account getAccountById(@PathVariable("id") String id){
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String uodateAccount(@PathVariable("id") String id, @RequestParam(value = "name",required = true)
                                 String name,@RequestParam("money") int money){
        int t = accountService.update(name,money,id);
        if (t == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") String id){
        int t = accountService.delete(id);
        if (t == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") int money){
        int t = accountService.add(name,money);
        if (t == 1){
            return "success";
        }else {
            return "fail";
        }
    }

}

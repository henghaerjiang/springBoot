package com.springboot.jpa.controller;

import com.springboot.jpa.domain.Account;
import com.springboot.jpa.repository.AccountRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/15.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    /**获取全部
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "查询全部",notes = "查询全部",code = 200)
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "",notes = "",code = 200)
    public Account getAccountById(@PathVariable("id") int id){
        return  accountRepository.findById(id).get();
    }

    /*@RequestMapping(value = "/find",method = RequestMethod.GET)
    public  Account getAccountByAccount(Account account){
        return accountRepository.findOne(account);
    }*/

}

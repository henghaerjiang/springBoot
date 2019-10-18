package com.springboot.mybatistx.service;

import com.springboot.mybatistx.dao.AccountMapper;
import com.springboot.mybatistx.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/18.
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public int add(String name,int money){
        String id = UUID.randomUUID().toString().replace("-","");
        return accountMapper.add(name,money,id);
    }

    @Transactional
    public int update(String name,int money,String id) throws RuntimeException{
        accountMapper.update(name,money,"2");//用户1减10块 用户2加10块
        int i=1/0;
        accountMapper.update(name,money,id);
        return accountMapper.update(name,money,"8ad8ea796dd8f52e016dd8f634ca0000");
    }

    public int delete(String id){
        return  accountMapper.delete(id);
    }

    public Account findAccount(String id){
        return accountMapper.findAccount(id);
    }

    public List<Account> findAccountList(){
        return accountMapper.findAccountList();
    }


}

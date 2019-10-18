package com.springboot.mybatis.service;

import com.springboot.mybatis.dao.AccountMapper;
import com.springboot.mybatis.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public int update(String name,int money,String id){
        return accountMapper.update(name,money,id);
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

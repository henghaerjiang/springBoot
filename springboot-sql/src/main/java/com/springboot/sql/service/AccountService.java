package com.springboot.sql.service;

import com.springboot.sql.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/5/10.
 */
@Service
public interface AccountService {
    public Object add(Account account);
    public Object update(Account account);
    public Object delete(String id);
    public Account findAccountById(String id);
    public List<Account> findAccountList();
}

package com.springboot.mybatistx.dao;

import com.springboot.mybatistx.domain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName AccountMapper
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/18.
 */
public interface AccountMapper {
    int add(@Param("name") String name, @Param("money") int money, @Param("id") String id);

    int update(@Param("name") String name, @Param("money") int money, @Param("id") String id);

    int delete(String id);

    Account findAccount(@Param("id") String id);

    List<Account> findAccountList();
}

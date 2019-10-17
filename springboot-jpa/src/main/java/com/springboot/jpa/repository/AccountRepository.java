package com.springboot.jpa.repository;

import com.springboot.jpa.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName AccountRepository
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/15.
 */
public interface AccountRepository extends JpaRepository<Account,String> {
}

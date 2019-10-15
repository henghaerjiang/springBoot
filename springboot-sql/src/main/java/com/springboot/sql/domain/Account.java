package com.springboot.sql.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Account
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/10.
 */
@Setter
@Getter
public class Account {
    private String id;
    private String name;
    private int money;
}

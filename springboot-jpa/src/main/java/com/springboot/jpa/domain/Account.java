package com.springboot.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Account
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/15.
 */
@Entity
@Table(name = "account")
@Setter
@Getter
public class Account {
    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  String money;
}

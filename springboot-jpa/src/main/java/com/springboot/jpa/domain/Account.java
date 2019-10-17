package com.springboot.jpa.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

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
    //generator 属性用于引用@GenericGenerator 注解 name 属性的值
    @GeneratedValue(generator = "uuid")
    //@GenericGenerator 注解是 hibernate 提供的。
    //strategy 属性用于指定 hibernate 中提供的生成规则
    //name 属性用于给使用的生成规则起个名称，以供 JPA 引用
    @GenericGenerator(name="uuid",strategy="uuid")
    private  String id;
    private  String name;
    private  int money;
}

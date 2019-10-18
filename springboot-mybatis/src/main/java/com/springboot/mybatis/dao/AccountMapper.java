package com.springboot.mybatis.dao;

import com.springboot.mybatis.domain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName AccountMapper
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/10/18.
 */
@Mapper
public interface AccountMapper {
    @Insert("insert into account(name,money,id) values(#{name},#{money},#{id})")
    int add(@Param("name") String name,@Param("money") int money,@Param("id") String id);

    @Update("update account set name = #{name},money = #{money} where id = #{id}")
    int update(@Param("name") String name,@Param("money") int money,@Param("id") String id);

    @Delete("delete from account where id = #{id}")
    int delete(String id);

    @Select("select id, name, money from account where id = #{id}")
    Account findAccount(@Param("id") String id);

    @Select("select id,name,money from account")
    List<Account> findAccountList();
}

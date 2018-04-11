package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserDao extends JpaRepository<User,Integer> {

    @Query("select id,username,password from t_user where username=:name")
    User findByName(@Param("name") String name);

    @Query("select id,username,password from t_user t")
    List<User> getList();
}

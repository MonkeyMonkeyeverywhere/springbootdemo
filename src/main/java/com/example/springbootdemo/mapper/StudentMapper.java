package com.example.springbootdemo.mapper;

import com.example.springbootdemo.config.mybatis.MyMapper;
import com.example.springbootdemo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper extends MyMapper<Student> {

    @Select("SELECT * FROM STUDENT WHERE name = #{name}")
    List<Student> likeName(@Param("name") String name);

    @Select("SELECT * FROM STUDENT WHERE id = #{id}")
    Student getById(@Param("id")int id);

    @Select("SELECT name FROM STUDENT WHERE id = #{id}")
    String getNameById(@Param("id")int id);
}

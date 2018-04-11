package com.example.springbootdemo.controller;


import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.mapper.StudentMapper;
import com.example.springbootdemo.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/getStudentList")
    public List<Student> getStudentList(){
        logger.info("从数据库读取Student集合");
        return studentService.getStudentList();
    }

    @RequestMapping("/likeName")
    public List<Student> likeName(String name){
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(2,2);
        return studentMapper.likeName(name);
    }
}

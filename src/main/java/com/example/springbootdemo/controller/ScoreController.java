package com.example.springbootdemo.controller;

import com.example.springbootdemo.dao.IScoreDao;
import com.example.springbootdemo.entity.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private IScoreDao scoreDao;

    @RequestMapping("/listScore")
    public List<Score> getScoreList(){
        logger.info("从数据库中读取分数列表！");
        return scoreDao.listScore();
    }
}

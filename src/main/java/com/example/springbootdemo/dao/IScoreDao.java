package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IScoreDao extends JpaRepository<Score,Integer> {

    @Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") String score,@Param("id") int id);

    @Query("select id,subjectName,score from Score t")
    List<Score> listScore();

}

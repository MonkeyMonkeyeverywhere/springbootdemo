package com.example.springbootdemo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 学生成绩
 */
@Entity
@Table(name = "score")
public class Score implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, name="STUDENTID")
    private String studentId;
    @Column(nullable = false, name="SUBJECTNAME")
    private String subjectName;
    @Column(nullable = true, name="SCORE")
    private String score;
    @Column(nullable = true, name="EXAMTIME")
    private String examTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }
}

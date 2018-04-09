package com.example.springbootdemo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {
    // 在Java类中创建 logger 实例
    private static final Logger logger = LoggerFactory.getLogger(TestLogback.class);

    public static void main(String[] args) {
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
    }
}

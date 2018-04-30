package com.example.springbootdemo.jms;

import javax.jms.Message;

public class JmsReceiver implements MessageHandler {
    @Override
    public void handle(Message message) {
        System.out.println("i get the message!");
    }
}

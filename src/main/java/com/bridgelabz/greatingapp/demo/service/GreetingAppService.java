package com.bridgelabz.greatingapp.demo.service;

import com.bridgelabz.greatingapp.demo.model.Message;
import com.bridgelabz.greatingapp.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService implements IGreetingService {
    @Autowired
    Message message;
    @Override
    public Message getGreetinHelloMessage() {
        message.setGreetingMessage("Hello world");
        return message;
    }
}
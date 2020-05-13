package com.bridgelabz.greatingapp.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    public String greetingMessage;

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
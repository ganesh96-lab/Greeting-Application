package com.bridgelabz.greatingapp.demo.controller;

import com.bridgelabz.greatingapp.demo.model.Message;
import com.bridgelabz.greatingapp.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
   IGreetingService iGreetingService;

    @GetMapping("/helloworld")
    public ResponseEntity<Message> getGreetingMessage(){
        return new ResponseEntity<>(iGreetingService.getGreetinHelloMessage(), HttpStatus.OK);
    }
}

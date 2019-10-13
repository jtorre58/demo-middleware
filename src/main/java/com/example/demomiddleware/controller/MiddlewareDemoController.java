package com.example.demomiddleware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiddlewareDemoController {
    //Testing Travis ci build
    @RequestMapping(value = "/getDateAndTime")
    public ResponseEntity<String> getTimeDate(){
        ResponseEntity<String> response;
        return new ResponseEntity<>("Null Value", HttpStatus.OK);
    }
}

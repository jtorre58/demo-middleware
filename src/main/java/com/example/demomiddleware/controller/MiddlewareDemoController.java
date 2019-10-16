package com.example.demomiddleware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MiddlewareDemoController {
    //Testing Travis ci build
    @RequestMapping(value = "/getDateAndTime", method = RequestMethod.GET)
    public ResponseEntity<String> getTimeDate(){
        ResponseEntity<String> response;
        return new ResponseEntity<>("Null Value", HttpStatus.OK);
    }
}

package com.project.rishabh.etrade.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtradeController {

    @GetMapping("trade/catalogue")
    public ResponseEntity<String> catalouge(){

        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}

package com.tntech.capstone.controller;

import com.tntech.capstone.entity.ExampleEntity;
import com.tntech.capstone.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
class ExampleController {
    @Autowired 
    private final ExampleService exampleService;

    ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/data")
    public ResponseEntity<List<ExampleEntity>> getData() {
        return new ResponseEntity<>(exampleService.findAll(), HttpStatus.OK);
    }
}

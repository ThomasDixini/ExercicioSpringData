package com.thomasdixini.exercicio_springdata.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controllers")
public class ApiRest {

    @GetMapping("/get")
    @ResponseBody String getHelloWorld(@RequestParam(required = false) String name) {
        return "Hello World" + name;
    }
}

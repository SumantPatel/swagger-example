package com.spatel.swagger.swaggerexample.resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
            return  "Hello World";
    }

    @PostMapping("/add")
    public String postHello(@RequestBody final String hello){
        return "hello";

    }
}

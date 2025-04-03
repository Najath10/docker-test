package com.ecommerce.docekrdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/message")
    public String getmessage() {
        return "Hello World  Najath Mohammed";
    }
}

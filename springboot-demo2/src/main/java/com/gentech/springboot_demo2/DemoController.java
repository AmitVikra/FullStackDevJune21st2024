package com.gentech.springboot_demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {
    //  http://localhost:9091/v1/demo/msg
    @GetMapping("/msg")
    public String getMesssage()
    {
        return "Welcome to Springboot Learning in Intellij!!";
    }


}

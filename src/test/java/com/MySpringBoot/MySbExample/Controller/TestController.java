package com.MySpringBoot.MySbExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public class HelloController {
        @GetMapping("/test/")
        public String helloworld() {
            return " welcome dosta";
        }
    }
}

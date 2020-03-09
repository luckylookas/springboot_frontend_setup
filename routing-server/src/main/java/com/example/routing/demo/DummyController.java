package com.example.routing.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DummyController {

    @GetMapping(path = "details", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDummyDetails() {
        return "{\"detail\": 123}";
    }
}

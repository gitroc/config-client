package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${info.profile}")
    private String profile;

    @Value("${info.from}")
    private String from;

    @Value("${test}")
    private String test;

    @RequestMapping("/configInfo")
    public String hello() {
        return "info.profile: " + profile + " info.from: " + from + " test: " + test + " !";
    }
}

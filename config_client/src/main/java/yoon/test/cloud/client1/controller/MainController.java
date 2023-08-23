package yoon.test.cloud.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/config")
    public String urlInfo(@Value("${spring.datasource.url}") String url) {
        return url;
    }
}

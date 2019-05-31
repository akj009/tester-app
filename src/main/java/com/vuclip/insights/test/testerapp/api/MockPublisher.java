package com.vuclip.insights.test.testerapp.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class MockPublisher {

    @PostMapping("/mock/publish")
    public String postMock(@RequestBody String request) {
        log.info(":::: incoming request: {}", request);
        return "done";
    }
}

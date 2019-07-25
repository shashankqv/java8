package com.shashankqv.java8.tdd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shashank Vivek on {19/7/19}.
 */

@RestController
@RequestMapping("/api/")
public class TestController {


    @PostMapping("/test")
    public ResponseEntity<?> testRequest(@RequestBody TestRequest testRequest) throws Exception {
        //
        TestRequest testRequestusingBuilder = TestRequest.builder()
                .age(20)
                .name("Shashank Vivek")
                .sex("MALE")
                .build();
        System.out.println("testRequestusingBuilder = " + testRequestusingBuilder);
        return ResponseEntity.ok(testRequest);
    }
}

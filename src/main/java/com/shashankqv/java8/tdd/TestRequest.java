package com.shashankqv.java8.tdd;

import lombok.Builder;

/**
 * @author Shashank Vivek on {25/7/19}.
 */

@Builder
public class TestRequest {
    private String name;
    private int age;
    private String sex;
}
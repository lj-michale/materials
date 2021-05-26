package com.example.stream;

import java.util.Arrays;

/**
 * @author lj.michale
 * @description
 * @date 2021-05-26
 */
public class StreamExample001 {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,45).stream()
                .filter(i -> i % 2 == 0 || i % 3 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);

    }

}

package com.example.leetcode.queue;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
public class QueueExample001 {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add("hello");
        queue.add("world");
        queue.add("Mufasa");
        queue.add("最后一个push");

        for(int i = 0; i < 4; i++) {
            System.out.println(queue.offer());
        }

    }
}
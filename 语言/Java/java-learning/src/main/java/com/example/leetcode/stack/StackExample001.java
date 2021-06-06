package com.example.leetcode.stack;

/**
 * @description
 *  先进后出的一种数据结构，解决方法：①双向链表，略；②数组后续遍历；
 *  使用Vector数组构建Stack
 * @author lj.michale
 * @date 2021-06-06
 */
public class StackExample001 {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("hello");
        stack.push("world");
        stack.push("Mufasa");
        stack.push("最后一个push");

        for(int i = 0; i < 4; i++) {
            System.out.println(stack.pop());
        }

    }
}

package com.example.leetcode.stack;

import java.util.List;
import java.util.Vector;
/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
class Stack<T>{

    private List<T> stack = new Vector<T>();

    public void push(T t){
        stack.add(t);
    }

    public T pop(){
        int size=stack.size();
        T mid;
        mid=stack.get(size-1);
        stack.remove(size-1);
        return mid;
    }

}
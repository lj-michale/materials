package com.example.leetcode.queue;

import java.util.List;
import java.util.Vector;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
public class Queue<T>{

    private List<T> stack=new Vector<T>();

    public void add(T t){
        stack.add(t);
    }

    public T offer(){
        int size = stack.size();
        T mid;
        mid=stack.get(0);
        stack.remove(0);
        return mid;
    }
}

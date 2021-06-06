package com.example.leetcode.gragh;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @description
 * 形式2：邻接表形式
 * @author lj.michale
 * @date 2021-06-06
 */
public class Graph2<T>{

    private LinkedList<LinkedList<T>> graph =new LinkedList<LinkedList<T>>();
    private LinkedList<T> midLinkedList;

    public void add(LinkedList<T> midLinkedList){
        this.graph.add(midLinkedList);
    }

    public void add(int index1, LinkedList<T> midLinkedList){
        this.graph.add(index1, midLinkedList);
    }

    public void getAll(){
        for(LinkedList<T> temp:this.graph){
            for(T temp1:temp){
                System.out.print(temp1 + ",");
            }
            System.out.println();
        }
    }

}

package com.example.leetcode.gragh;

import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @description
 * 有两种类型，类型1：邻接矩阵形式
 * @author lj.michale
 * @date 2021-06-06
 */
public class Graph1 {

    //叠加Vector，【行】为Vector，【列】为元素
    private Vector<Vector<Integer>> graph = new Vector<Vector<Integer>>();
    private Vector<Integer> midVector;
    public Graph1(){}

    public void add(Vector<Integer> midVector){
        this.graph.add(midVector);
    }

    public void add(int index1,Vector<Integer> midVector){
        this.graph.add(index1, midVector);
    }

    public void add(int index1, int t){
        midVector = graph.get(index1);
        midVector.add(t);
        graph.set(index1,midVector);
    }

    public void add(int index1, int index2, int t){
        midVector = graph.get(index1);
        midVector.add(index2,t);
        graph.set(index1,midVector);
    }

    public void set(int index1, int index2, int t){
        midVector = graph.get(index1);
        midVector.set(index2, t);
        graph.set(index1, midVector);
    }

    public int get(int index1, int index2){
        midVector = graph.get(index1);
        return midVector.get(index2);
    }

    public void getAll(){
        for(Vector<Integer> temp:graph) {
            for(Integer temp1:temp) {
                System.out.print(temp1 + ",");
            }
            System.out.println("");
        }
    }

}
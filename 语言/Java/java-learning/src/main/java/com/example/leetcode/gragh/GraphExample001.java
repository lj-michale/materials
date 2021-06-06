package com.example.leetcode.gragh;

import java.util.LinkedList;

/**
 * @description
 * 图数据结构有两种表现形式：①邻接矩阵形式；②邻接表形式；
 * @author lj.michale
 * @date 2021-06-06
 */
public class GraphExample001 {

    public static void main(String[] args) {

        Graph2 graph = new Graph2();
        LinkedList<Integer> linkedList;

        for(int i = 0; i < 3; i++) {
            linkedList = new LinkedList<Integer>();
            for(int j = 0; j < 5; j++) {
                linkedList.add(j+i);
            }
            graph.add(linkedList);
        }

        graph.getAll();

    }

}

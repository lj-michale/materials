package com.example.leetcode.linkedlist;

/**
 *
 * @description
 * 　使用Node节点进行设计，功能：基本的setter、getter、add、getSize、remove等功能。
 * @author lj.michale
 * @date 2021-06-06
 */
public class LinkedListExample001{

    public static void main(String[] args) {

        String[] array = {"begin", "1", "2", "3", "4", "5"};
        Node rootNode = null;
        Node indexNode = null;
        boolean flag = true;

        for(String str:array) {
            if(flag) {
                rootNode = new Node(str);
                indexNode = rootNode;
                flag = false;
            } else {
                indexNode.setNextNode(new Node(str));
                indexNode = indexNode.getNextNode();
            }
        }

        rootNode.add(new Node("添加元素"),2);
        indexNode = rootNode;
        System.out.println(rootNode.getSize());

        while(true){
            System.out.println(indexNode.getStr());
            if(indexNode.hasNext() == false) {
                break;
            }
            indexNode = indexNode.getNextNode();
        }
    }
}

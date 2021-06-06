package com.example.leetcode.linkedlist;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
public class Node {

    private String str = null;

    private Node nextNode = null;

    public Node(String str){
        this.str=str;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str=str;
    }

    /**
     * @descr 先遍历到最后一个再添加
     * @param nextNode
     * @param i
     */
    public void add(Node nextNode, int i){
        Node indexNode = this.nextNode;
        while(true){
            if(indexNode.hasNext() == false) {
                break;
            }
            indexNode=indexNode.getNextNode();
        }
        indexNode.setNextNode(nextNode);
    }

    public boolean hasNext(){
        if(nextNode != null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize(){
        int size = 0;
        Node indexNode = this.nextNode;
        while(true) {
            size++;
            if(indexNode.hasNext() == false) {
                break;
            }
            indexNode = indexNode.getNextNode();
        }
        return size;
    }
}

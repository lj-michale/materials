package com.example.leetcode.tree.example002;

/**
 * @description
 *
 * @author lj.michale
 * @date 2021-06-06
 */
public class BinTree{

    private String str;
    private BinTree leftTree;
    private BinTree rightTree;

    public BinTree(String str){
        this.str = str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setLeftTree(BinTree leftTree) {
        this.leftTree = leftTree;
    }

    public void setRightTree(BinTree rightTree) {
        this.rightTree = rightTree;
    }

    public String getStr() {
        return str;
    }

    public BinTree getLeftTree() {
        return leftTree;
    }

    public BinTree getRightTree() {
        return rightTree;
    }

}

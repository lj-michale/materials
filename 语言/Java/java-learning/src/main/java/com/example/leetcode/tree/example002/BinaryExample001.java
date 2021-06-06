package com.example.leetcode.tree.example002;

/**
 * @description
 *
 * @author lj.michale
 * @date 2021-06-06
 */
public class BinaryExample001 {

    public static void main(String[] args) {

        BinTree rootTree = new BinTree("a");
        rootTree.setLeftTree(new BinTree("b"));
        rootTree.setRightTree(new BinTree("c"));

        BinTree midTree = null;
        midTree = rootTree.getLeftTree();
        midTree.setLeftTree(new BinTree("d"));
        midTree.setRightTree(new BinTree("e"));

        midTree = rootTree.getRightTree();
        midTree.setLeftTree(new BinTree("f"));
        midTree.setRightTree(new BinTree("g"));

    }
}

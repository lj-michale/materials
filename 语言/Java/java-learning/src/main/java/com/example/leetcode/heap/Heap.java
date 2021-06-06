package com.example.leetcode.heap;

import java.util.ArrayList;

/**
 * @description
 * Java类集中的ArrayList实现Heap
 * @author lj.michale
 * @date 2021-06-06
 */
public class Heap {

    private ArrayList<Integer> arryList = new ArrayList<Integer>();
    // true表示最大堆，false表示最小堆
    private boolean type;
    // 只是负责数据交换
    private Integer mid_i;

    public Heap(boolean type){
        this.type=type;
    }

    public void add(int i){
        arryList.add(i);
        shiftUp(this.arryList.size()-1);
    }

    public int deletRoot(){//删除根节点并返回其值
        int mid_root = this.arryList.get(0);
        this.mid_i = this.arryList.get(this.arryList.size()-1);
        this.arryList.remove(this.arryList.size()-1);
        this.arryList.set(0,this.mid_i);
        shiftDown(0);
        return mid_root;
    }

    public int delet(int index){//删除指定index节点，并返回其值
        if(index<0 || index>this.arryList.size()-1) {
            throw new IndexOutOfBoundsException("删除节点index范围有误");
        }
        int mid_value = this.arryList.get(index);
        this.mid_i=this.arryList.get(this.arryList.size()-1);
        this.arryList.remove(this.arryList.size()-1);
        this.arryList.set(index, this.mid_i);
        shiftDown(index);
        return mid_value;
    }

    private void shiftUp(int index){//添加数据的时候进行操作
        if(type) {//最大堆
            if((index-1) / 2 != -1) {
                if(this.arryList.get((index - 1) / 2) <this.arryList.get(index)){
                    mid_i = this.arryList.get((index - 1) / 2);
                    this.arryList.set((index - 1) / 2,this.arryList.get(index));
                    this.arryList.set(index,mid_i);
                    //递归调用
                    shiftUp((index - 1) / 2);
                }
            }
        } else {//最小堆
            if((index-1)/2 != -1) {
                if(this.arryList.get((index - 1) / 2) >this.arryList.get(index)){
                    mid_i = this.arryList.get((index - 1) / 2);
                    this.arryList.set((index - 1) / 2,this.arryList.get(index));
                    this.arryList.set(index, mid_i);
                    //递归调用
                    shiftUp((index - 1) / 2);
                }
            }
        }
    }

    private void shiftDown(int index){//删除数据的时候进行操作
        if(type){//最大堆
            if(index * 2 + 1 < this.arryList.size()) {
                if(this.arryList.get(2 * index + 1) > this.arryList.get(index)){
                    mid_i = this.arryList.get(2 * index+1);
                    this.arryList.set(2 * index + 1, this.arryList.get(index));
                    this.arryList.set(index, mid_i);
                    //递归调用
                    shiftDown(2 * index + 1);
                }
            }
        } else {//最小堆
            if(index * 2 + 1 < this.arryList.size()) {
                if(this.arryList.get(2 * index + 1) < this.arryList.get(index)){
                    mid_i = this.arryList.get(2 * index + 1);
                    this.arryList.set(2 * index + 1,this.arryList.get(index));
                    this.arryList.set(index, mid_i);
                    //递归调用
                    shiftDown(2 * index+1);
                }
            }
        }
    }

    public ArrayList<Integer> getHeap() {
        return this.arryList;
    }
}

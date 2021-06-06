package com.example.leetcode.heap;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
public class HeapExample001 {

    public static void main(String[] args) {

        Heap heap = new Heap(false);
        heap.add(5);
        heap.add(10);
        heap.add(1);
        heap.add(7);
        heap.add(2);

        System.out.println(heap.getHeap());
        System.out.println(heap.deletRoot());
        System.out.println(heap.getHeap());

        // heap.delet(-1);

    }
}

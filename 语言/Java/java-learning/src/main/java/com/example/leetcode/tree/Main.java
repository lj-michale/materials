package com.example.leetcode.tree;

import java.util.Random;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-05
 */
public class Main {

    public static void main(String[] args) {
        randomInsert(1000000, 1024);
    }

    private static void orderInsert(int size, int order) {

        long startTime = System.currentTimeMillis();

        for (int j = 0; j < 10; j++) {
            BplusTree<Long, Long> tree = new BplusTree<Long, Long>(1024);
            for (long i = 0; i < size; i++)
            {
                tree.insertOrUpdate(i, Long.valueOf(i));
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("total: " + (endTime - startTime) + "ms");
        System.out.println("avg: " + (endTime - startTime) / 10.0 + "ms");
    }

    private static void randomInsert(int size, int order) {

        long totalTime = 0;
        Random random = new Random(2333);

        for (int j = 0; j < 10; j++) {
            Long[] dataList = new Long[size];

            for (int i = 0; i < size; i++) {
                dataList[i] = Long.valueOf(i);
                if (i > 0) {
                    int swapIndex = random.nextInt(i);
                    Long tmp = dataList[swapIndex];
                    dataList[swapIndex] = dataList[i];
                    dataList[i] = tmp;
                }
            }

            long startTime = System.currentTimeMillis();
            BplusTree<Long, Long> tree = new BplusTree<Long, Long>(order);

            for (int i = 0; i < size; i++) {
                tree.insertOrUpdate(dataList[i], dataList[i]);
            }

            long endTime = System.currentTimeMillis();
            totalTime += endTime - startTime;
        }

        System.out.println("total: " + (totalTime) + "ms");
        System.out.println("avg: " + (totalTime) / 10.0 + "ms");
    }
}
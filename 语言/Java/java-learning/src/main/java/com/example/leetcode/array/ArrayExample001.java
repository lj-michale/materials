package com.example.leetcode.array;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lj.michale
 * @description
 * @date 2021-06-06
 */
@Slf4j
public class ArrayExample001 {

    public static void main(String[] args) {

        //需要初始化长度
        String [] array=new String[5];
        array[0]="hello";
        array[1]="world";
        array[4]="Mufasa";
        // array[5]="right or not";//ArrayIndexOutOfBoundsException

        for(String str:array) {
            //hello、world、null、null、Mufasa、
            System.out.print(str+"、");
        }

        log.info(">>>>>>>>>>>>>>>>>对实例化数组进行扩容\n");
        // 对实例化数组进行扩容
        String [] array2 = {"hello","world",null,null,"Mufasa"};
        array2 = (String[])resizeArray(array2,10);
        for(String str:array2){
            //hello、world、null、null、Mufasa、
            System.out.print(str+"、");
        }

    }

    // 对实例化数组进行扩容【利用Java反射机制】
    private static Object resizeArray(Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray); //获取旧数组长度,向上转型！！！
        // int oldSize =oldArray.length;//无法在此使用，因为array内容的是不定类型
        Class elementType = oldArray.getClass().getComponentType(); //获取对象类别
        Object newArray = java.lang.reflect.Array.newInstance(elementType,newSize); //利用Java的反射机制实例化新数组
        int preserveLength = Math.min(oldSize, newSize); //判断是否需要copy数据
        if (preserveLength > 0) {
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        }
        return newArray; //oldArray切断索引成为垃圾由Runtime.getRuntime().gc();回收处理
    }
}

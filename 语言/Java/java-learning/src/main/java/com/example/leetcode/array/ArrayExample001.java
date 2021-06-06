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
        String [] array = new String[5];
        array[0]="hello";
        array[1]="world";
        array[4]="Mufasa";
        // array[5]="right or not";//ArrayIndexOutOfBoundsException
        arrayPrint(array);

        log.info(">>>>>>>>>>>>>>>>>对实例化数组进行扩容\n");
        // 对实例化数组进行扩容
        String [] array2 = {"hello","world",null,null,"Mufasa"};
        array2 = (String[])resizeArray(array2,10);
        arrayPrint(array2);

        log.info(">>>>>>>>>>>>>>>>>数组删除与增添，本质上是创建新的数值并且copy数值【需要私有反射实例化新数组，这里需要进一步优化】\n");
        array = drop(array,3);
        arrayPrint(array);

    }

    /**
     * @descr 对实例化数组进行扩容【利用Java反射机制】
     * @date 2021/6/6 16:21
     * @param oldArray
     * @param newSize
     */
    private static Object resizeArray(Object oldArray, int newSize) {
        //获取旧数组长度,向上转型！！！
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        // int oldSize =oldArray.length;//无法在此使用，因为array内容的是不定类型
        //获取对象类别
        Class elementType = oldArray.getClass().getComponentType();
        //利用Java的反射机制实例化新数组
        Object newArray = java.lang.reflect.Array.newInstance(elementType,newSize);
        //判断是否需要copy数据
        int preserveLength = Math.min(oldSize, newSize);
        if (preserveLength > 0) {
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        }
        //oldArray切断索引成为垃圾由Runtime.getRuntime().gc();回收处理
        return newArray;
    }

    /**
     * @descr 删除指定位置上的元素
     * @date 2021/6/6 16:21
     * @param oldArray
     * @param index
     */
    public static String[] drop(Object[] oldArray, int index) {
        int size = java.lang.reflect.Array.getLength(oldArray);
        if(index < 0 || index > size) {
            throw new RuntimeException("删除索引范围有误");
        }else {
            //获取对象类别
            Class elementType = oldArray.getClass().getComponentType();
            Object newArray = java.lang.reflect.Array.newInstance(elementType,size-1);
            String[] newStringArray = (String[])newArray;
            int counter = 0;
            for(int i = 0; i < oldArray.length; i++) {
                if(i != index){
                    newStringArray[counter] = (String) oldArray[i];
                    counter++;
                }else {
                    continue;
                }
            }
            return newStringArray;
        }
    }

    /**
     * @descr 数组元素打印
     * @date 2021/6/6 16:21
     * @param array
     */
    public static void arrayPrint(String[] array) {
        for(String str : array){
            System.out.print(str + "、");
        }
    }



}

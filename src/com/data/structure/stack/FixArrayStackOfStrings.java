package com.data.structure.stack;

/**
 * 字符串 固定容量栈
 * Author: zhouy
 * Date: 2016/11/22
 */
public class FixArrayStackOfStrings {

    private String[] arrays;

    private int n = 0;

    public FixArrayStackOfStrings(int capacity){
        arrays = new String[capacity];
    }

    /**
     * 入栈
     * @param item
     */
    public void push(String item){
        if(n < arrays.length){
            arrays[n++] = item;
        }
    }

    /**
     * 出栈
     * @return
     */
    public String pop(){
        if(!isEmpty()){
            return arrays[--n];
        }
        return null;
    }

    /**
     * 大小
     * @return
     */
    public int size(){
        return n;
    }

    /**
     * 是否为null
     * @return
     */
    public boolean isEmpty(){
        return n==0;
    }
}

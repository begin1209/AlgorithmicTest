package com.data.structure.stack;

import java.util.Iterator;

/**
 * 数据结构  栈的实现（数组）
 * 在实现过程中还实现了Iterator
 * Author: zhouy
 * Date: 2016/11/22
 */
public class ArrayStack<Item> implements Iterable<Item>{

    private Item[] items = null;

    private int N = 0;

    public ArrayStack(int capacity){
        items = (Item[])new Object[capacity];
    }

    public void push(Item item){
        if(N == items.length - 1){
            resize(2*items.length);  //改变容量大小
        }
        items[N++] = item;
    }

    public Item pop(){
        Item item = items[--N];
        if(N == items.length/4){
            resize(items.length/2);
            items[N] = null;
        }

        return item;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    private void resize(int max){
        Item[] temp = (Item[])new Object[max];
        for(int i = 0; i < items.length; i++){
            temp[i] = items[i];
        }
        items = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<Item>{

        int n = N;

        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Item next() {
            return items[--n];
        }
    }
}

package com.data.structure.quene;

import java.util.Iterator;

/**
 * 数据结构 队列 链表实现 效率比数组高（数组复制时间与栈的大小成正比）
 * Author: zhouy
 * Date: 2016/11/22
 */
public class LinkListQuene<Item> implements Iterable<Item> {

    private Node first;

    private Node last;

    private int N;

    private class Node{
        Item item;
        Node next;
    }

    public void enquene(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequene(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        N--;
        return item;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    private int size(){
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkListQueneIterator();
    }

    private class LinkListQueneIterator implements Iterator<Item>{

        int n = N;

        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Item next() {
            Item item = first.item;
            first = first.next;
            if(isEmpty()){
                last = null;
            }
            n--;
            return item;
        }
    }
}

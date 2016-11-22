package com.data.structure.stack;

import java.util.Iterator;

/**
 * 数据结构 栈，链表实现 比数组实现高效
 * Author: zhouy
 * Date: 2016/11/22
 */
public class LinkListStack<Item> implements Iterable<Item>{

    private Node node = null;

    private int N = 0;

    @Override
    public Iterator<Item> iterator() {
        return new LinkListStackIterator();
    }

    private class Node{
        Item item;
        Node next;
    }

    public void push(Item item){
        Node oldNode = node;
        node = new Node();
        node.item = item;
        node.next = oldNode;
        N++;
    }

    public Item pop(){
        Item item = node.item;
        node = node.next;
        N--;
        return item;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    private class LinkListStackIterator implements Iterator<Item>{

        int n = N;

        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Item next() {
            Item item = node.item;
            node = node.next;
            n--;
            return item;
        }
    }
}

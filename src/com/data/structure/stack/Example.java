package com.data.structure.stack;

/**
 * Author: zhouy
 * Date: 2016/11/22
 */
public class Example {

    public static void main(String[] args){
//        fixArayStackTest();
//        arrayStackTest();
//        linkListStackTest();
        linkListQueneTest();
    }

    private static void arrayStackTest(){
        ArrayStack<Integer> arrayStack = new ArrayStack<>(100);
        for(int i = 0; i< 200; i++){
            arrayStack.push(i);
        }
        for(Integer a: arrayStack){
            System.out.println(a);
        }
    }

    private static void fixArayStackTest(){
        FixArrayStackOfStrings stackOfStrings = new FixArrayStackOfStrings(20);
        for (int i = 0; i < 21; i++){
            stackOfStrings.push(i+"");
        }
        while (!stackOfStrings.isEmpty()){
            System.out.println(stackOfStrings.pop());
        }
    }

    private static void linkListStackTest(){
        LinkListStack<String> stack = new LinkListStack<>();
        for(int i = 0; i < 1000; i++){
            stack.push(i+"");
        }
        for (String s: stack){
            System.out.println(s);
        }
    }

    private static void linkListQueneTest(){
        LinkListQuene<String> quene = new LinkListQuene<>();
        for (int i = 0; i < 10000; i++){
            quene.enquene(i+"");
        }
        for (String s: quene){
            System.out.println(s);
        }
    }
}

package com.data.sort;

/**
 * User: zhy
 * Date: 2016-10-20
 */
public class ExerciseTest {


    public static void main(String args[]){
        String string = "hello";
        if(string == "hello"){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        String x = new String("fmn");

        x.toUpperCase();
        System.out.println(x);
        String y = x.replace("f","F");
        y = y+"xyz";
        System.out.println(y);

        Example eample = new Example();
        int i = 0;
        fermin(i);
        i++;
        System.out.println("运行结果："+i);

        int a = 5;
        int b = 10;
        System.out.println(a+~b);
        short ab = 128;
        byte cd = (byte)ab;
        System.out.println(cd);

        String  aaa = "hello";
        String bbb = "hello";
        String ddd = new String("hello");
        char[] ccc = {'h','e','l','l','o'};
        System.out.println(bbb.equals(ccc));
        System.out.println(bbb == ddd);
    }

    public  static void fermin(int i){
        i = i++;
    }

    public static int getValue(){
        int a = 1;
        try{
            return ++a;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ++a;
            return ++a;
        }
    }
}

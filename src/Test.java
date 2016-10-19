import java.util.Iterator;

/**
 * User: zhy
 * Date: 2016-07-22
 */
public class Test {

    public static void main(String[] args){
        CounterTest test = new CounterTest();
        incre(test);
        System.out.println("CounterTest:"+test.getTotal());
        int[] abc = new int[100];
        int total = abc.length;

        String string = "abc:cde:afdgag:aba:ccd:134";
        String[] splitString = string.split(":");
        for(String s: splitString){
            System.out.println(s);
        }

        int n = 2;
        int[] a = new int[]{1,3,5};
        System.out.println(a[--n]);

        FixCapacityStackofString stack = new FixCapacityStackofString(10);
        for (int i = 0; i < 10; i++){
            stack.push("item"+i);
        }
        System.out.println(stack.pop());

        FixCapacityStack<String> testStack = new FixCapacityStack<>(100);
        for(int i = 0; i < 100; i++){
            testStack.push("String: "+i);
        }

        testStack.push("我是第一百个");
        testStack.push("我是第一百零一个");
        testStack.push("我是第一百零二个");
        Iterator<String> iterator = testStack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void incre(CounterTest test){
        test.increment();
        System.out.println("main:"+test.getTotal());
    }
}

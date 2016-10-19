/**
 * User: zhy
 * Date: 2016-07-22
 */
public class FixCapacityStackofString {

    private String[] stack = null;

    private int n = 0;

    public FixCapacityStackofString(int capacity){
        stack = new String[capacity];
    }

    public void push(String item){
        stack[n++] = item;
    }

    public String pop(){
        return stack[--n];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }


}

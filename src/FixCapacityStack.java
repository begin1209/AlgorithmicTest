import java.util.Iterator;

/**
 * User: zhy
 * Date: 2016-07-22
 */
public class FixCapacityStack<Item>  {

    private Item[] itemStack = null;

    private int itemNum = 0;

    public FixCapacityStack(int capacity){
        itemStack =  (Item[]) new Object[capacity];
    }

    public boolean isEmpity(){
        return itemNum == 0;
    }

    public int size(){
        return itemNum;
    }

    public void push(Item item){
        if(itemNum == itemStack.length){
            resize(2*itemNum);
        }
        itemStack[itemNum++] = item;
    }

    public Item pop(){
        Item item = itemStack[--itemNum];
        itemStack[itemNum] = null;
        if(itemNum > 0 && itemNum == itemStack.length/4){
            resize(itemNum/2);
        }
        return item;
    }

    private void resize(int max){
        Item[] temp = (Item[])new Object[max];
        for (int i = 0; i < itemNum; i++){
            temp[i] = itemStack[i];
        }
        itemStack = temp;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{

        private int i = itemNum;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return itemStack[--i];
        }

        @Override
        public void remove() {

        }
    }
}

/**
 * User: zhy
 * Date: 2016-07-25
 *
 */
public class LinklistStack<Item> {

    private Node currentNode = null;

    private int num = 0;

    private LinklistStack(){
    }

    public void push(Item item){
        Node oldNode = currentNode;
        currentNode = new Node();
        currentNode.item = item;
        currentNode.next = oldNode;
        num++;
    }

    public Item pop(){
        Item popItem = currentNode.item;
        currentNode = currentNode.next;
        num--;
        return popItem;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return currentNode.next == null;
    }

    private class Node{
        private Item item;
        Node next;
    }

    public static void main(String[] args){
        LinklistStack<String> linklistStack  = new LinklistStack<>();
        for(int i = 0; i < 10; i++){
            linklistStack.push("LinklistStack push :" + i);
        }
        System.out.println("LinklistStack num:" + linklistStack.size());
        for (int i = 0; i < 10; i++){
            System.out.println(linklistStack.pop());
            System.out.printf("num: "+linklistStack.size());
        }
    }
}

/**
 * User: zhy
 * Date: 2016-07-25
 */
public class LinkListQuenu<Item> {

    private Node first = null;

    private Node last = null;

    private int num = 0;

    public void enquene(Item item){
        Node oldNode = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldNode.next = last;
        }
        num++;
    }

    public Item dequene(){
        Node oldNode = first;
        first = first.next;
        num--;
        return oldNode.item;
    }



    public boolean isEmpty(){
        return num == 0;
    }

    public int size(){
        return num;
    }


    private class Node{
        Node next = null;
        Item item = null;
    }

    public static void main(String[] args){
        LinkListQuenu<String> linkListQuenu = new LinkListQuenu<>();
        for(int i = 0; i < 10; i++){
            linkListQuenu.enquene("Enquene Item: "+i);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(linkListQuenu.dequene());
        }
    }
}

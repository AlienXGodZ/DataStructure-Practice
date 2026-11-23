//Manual Linked List

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;

    }


}

public class Test118 {
    public static void main(String[] args){

         Node first = new Node(5);

         System.out.println(first.data);
         System.out.println(first.next);


    }
}

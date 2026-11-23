//Connect Three Node in manual Linked list

public class Test119 {
    public static void main(String[] args){

        Node first = new Node(5);
        Node second = new Node(6);
        Node third = new Node(8);

        first.next = second;
        second.next = third;

        Node head = first;



        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

    }
}

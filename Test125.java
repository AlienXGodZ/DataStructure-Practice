//Using dll means using head and tails,so insert at end and delete at end becomes o(1);

public class Test125 {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {

            this.data = data;
            this.prev = null;
            this.next = null;

        }

    }

    static class DoublyLinkedList {

        Node head;
        Node tail;

        void insertAtBeginning(int data) {

            Node newnode = new Node(data);

            if (head == null) {

                head = newnode;
                tail = newnode;
                return;

            }

            newnode.next = head;

            head.prev = newnode;

            head = newnode;


        }

        void insertAtEnd(int data) {

            Node newnode = new Node(data);

            if (head == null) {

                head = newnode;
                tail = newnode;
                return;

            }

            tail.next = newnode;
            newnode.prev = tail;

            tail = newnode;

        }

        void deleteAtBeginning() {

            if (head == null) {

                System.out.println("List is Empty");
                return;

            }

            if(head == tail){

                head = null;
                tail = null;
                return;

            }

            head = head.next;

            head.prev = null;


        }

        void deleteAtEnd() {

            if (head == null) {

                System.out.println("List is Empty");
                return;

            }

            if(head == tail){

                head = null;
                tail = null;
                return;


            }

            tail = tail.prev;

            tail.next = null;

        }

        void displayForward() {

            Node temp = head;

            while (temp != null) {

                System.out.print(temp.data + " ⇄ ");
                temp = temp.next;

            }

            System.out.println("Null");
            System.out.println();

        }

        void displayBackward() {

            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }

            System.out.println("null");
        }
    }


    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original:");
        list.displayForward();

        list.insertAtBeginning(5);
        list.insertAtEnd(40);

        System.out.println("After insertion:");
        list.displayForward();

        list.deleteAtBeginning();
        list.deleteAtEnd();

        System.out.println("After deletion:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();


    }

}

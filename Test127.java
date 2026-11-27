import java.util.HashSet;

public class Test127 {

    static class Node{

        int data;
        Node prev;
        Node next;

        Node(int data){

            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    static class CircularDoublyLinkedList{

        Node head;

        void insertAtBeginning(int data){

            Node newnode = new Node(data);

            if(head == null) {

                head = newnode;

                newnode.next = newnode;
                newnode.prev = newnode;

                return;

            }

            Node last = head.prev;

            newnode.next = head;
            newnode.prev = last;

            last.next = newnode;
            head.prev = newnode;

            head = newnode;

        }

        void insertAtEnd(int data){

            Node newnode = new Node(data);

            if(head == null){

                head = newnode;

                newnode.next = newnode;
                newnode.prev = newnode;

                return;

            }

            Node last = head.prev;

            newnode.next = head;
            newnode.prev = last;

            last.next = newnode;
            head.prev = newnode;

        }

        void insertAtPosition(int data,int position){

            Node newnode = new Node(data);

            if(position == 0){

                insertAtBeginning(data);
                return;

            }

            Node temp = head;

            for(int i = 0; i < position - 1; i++){

                if(temp.next == head){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;

            }

            newnode.next = temp.next;
            newnode.prev = temp;

            temp.next = newnode;
            newnode.next.prev = newnode;

        }

        void deleteAtBeginning(){

            if(head == null){

                System.out.println("List is Empty");
                return;

            }

            if(head.next == head){

                head = null;
                return;

            }

            Node last = head.prev;

            head = head.next;

            head.prev = last;

            last.next = head;

        }

        void deleteAtEnd(){

            if(head == null){

                System.out.println("Invalid");
                return;

            }

            Node last = head.prev;

            Node lastprev = last.prev;

            lastprev.next = head;

            head.prev = lastprev;

        }

        void deleteAtPosition(int position){

            if(head == null){

                System.out.println("List is empty");
                return;

            }



            Node temp = head;

            for(int i = 0; i < position; i++){

                if(temp.next == head){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;

            }

            if (temp.next == head && temp.prev == head) {
                head = null;
                return;
            }

            if(temp == head){

                head = head.next;

            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

        }

        void displayForward() {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;

            do {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            } while (temp != head);

            System.out.println("(back to head)");
        }

        // Display Backward
        void displayBackward() {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head.prev;
            Node tail = temp;

            do {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            } while (temp != tail);

            System.out.println("(back to tail)");
        }


        void removeDuplicates() {

            if (head == null || head.next == head) {
                return;
            }

            HashSet<Integer> set = new HashSet<>();

            Node temp = head;

            do {

                if (set.contains(temp.data)) {

                    Node duplicate = temp;

                    // If duplicate is head
                    if (temp == head) {
                        head = head.next;
                    }

                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;

                    temp = temp.next;

                } else {

                    set.add(temp.data);

                    temp = temp.next;
                }

            } while (temp != head);

        }


    }



    public static void main(String[] args){

        CircularDoublyLinkedList list =
                new CircularDoublyLinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.displayForward();

        System.out.println("\nAfter Insertion at Position 3:");
        list.insertAtPosition(25, 3);
        list.displayForward();

        System.out.println("\nAfter Deletion at Beginning:");
        list.deleteAtBeginning();
        list.displayForward();

        System.out.println("\nAfter Deletion at End:");
        list.deleteAtEnd();
        list.displayForward();

        System.out.println("\nAfter Deletion at Position 2:");
        list.deleteAtPosition(2);
        list.displayForward();

        System.out.println("\nBackward Traversal:");
        list.displayBackward();


    }
}

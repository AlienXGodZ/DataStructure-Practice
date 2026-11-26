public class Test124 {

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

    static class DoublyLinkedList{

        Node head;

        void insertAtBeginning(int data){

            Node newnode = new Node(data);

            if(head == null){

                head = newnode;
                return;

            }

            newnode.next = head;

            head.prev = newnode;

            head = newnode;

        }

        void insertAtEnd(int data){

            Node newnode = new Node(data);

            if(head == null){

                head = newnode;
                return;

            }

            Node temp = head;

            while(temp.next != null){

                temp = temp.next;

            }

            temp.next = newnode;

            newnode.prev = temp;

        }

        void insertAtPosition(int data,int position){

            Node newnode = new Node(data);

            if(position == 0){

                insertAtBeginning(data);
                return;

            }

            Node temp = head;

            for(int i = 0; i < position - 1; i++){

                if(temp == null){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;

            }

            if(temp == null){

                System.out.println("Invalid Position");
                return;

            }

            newnode.next = temp.next;

            newnode.prev = temp;

            if(temp.next != null){

                temp.next.prev = newnode;

            }

            temp.next = newnode;

            }

            void deleteAtPosition(int position){

            if(position == 0){

                head = head.next;

                if(head != null) {

                    head.prev = null;

                }

                return;
            }

            Node temp = head;

            for(int i = 0; i < position; i++){

                if(temp == null){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;

            }

            if(temp.prev != null){

                temp.prev.next = temp.next;

            }

            if(temp.next != null){

                temp.next.prev = temp.prev;

            }

            }

           void reverse(){

            Node current = head;

            Node newhead = null;

            while(current != null){

                Node currentnode = current.next;

                current.next = current.prev;

                current.prev = currentnode;

                newhead = current;

                current = currentnode;

            }

            head = newhead;

           }

           void displayForward(){

            Node temp = head;

            while(temp != null){

                System.out.print(temp.data + " ⇄");
                temp = temp.next;

            }

            System.out.println("Null");
            System.out.println();

           }

        }


    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original:");
        list.displayForward();

        list.insertAtPosition(15, 1);

        System.out.println("After insertion:");
        list.displayForward();

        list.deleteAtPosition(2);

        System.out.println("After deletion:");
        list.displayForward();

        list.reverse();

        System.out.println("After reversing:");
        list.displayForward();


    }
}

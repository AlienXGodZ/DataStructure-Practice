public class Test126 {

    static class Node{

        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;

        }

    }

    static class CircularLinkedList{

        Node head;

        void insertAtBeginning(int data){

            Node newnode = new Node(data);

            if(head == null){

                head = newnode;
                newnode.next = head;
                return;

            }

            Node temp = head;

            while(temp.next != head){

                temp = temp.next;

            }

            newnode.next = head;

            temp.next = newnode;

            head = newnode;

        }

        void insertAtEnd(int data){

            Node newnode = new Node(data);

            if(head == null){

                head = newnode;
                newnode.next = head;
                return;

            }


            Node temp = head;

            while(temp.next != head){

                temp = temp.next;

            }

            temp.next = newnode;

            newnode.next = head;

        }

        void display(){

            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node temp = head;

            do{

                System.out.print(temp.data + "-->");
                temp = temp.next;

            }while(temp != head);

            System.out.println("(Back to Head)");
            System.out.println();

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

            Node temp = head;

            while(temp.next != head){

                temp = temp.next;

            }

            head = head.next;

            temp.next = head;

            }

            void deleteAtEnd(){

            if(head == null){

                System.out.println("List is empty");
                return;

            }

                if(head.next == head){
                    head = null;
                    return;
                }


            Node temp = head;

            while(temp.next.next != head){

                temp = temp.next;

            }

            temp.next = head;


            }

            void deleteAtPosition(int position){

            if(position == 0){

                deleteAtBeginning();
                return;

            }

            Node temp = head;

            for(int i = 0; i < position - 1; i++){

                if(position == 0){
                    deleteAtBeginning();
                    return;
                }

                if(temp.next == head){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;

            }

            if(temp.next == head){

                System.out.println("Invalid");
                return;

            }

            temp.next = temp.next.next;

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

            temp.next = newnode;

            }

        }

    public static void main(String[] args){

        CircularLinkedList list = new CircularLinkedList();

        // Insert at end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.display();


        // Insert at beginning
        list.insertAtBeginning(5);

        System.out.println("\nAfter Insertion at Beginning:");
        list.display();


        // Insert at end
        list.insertAtEnd(50);

        System.out.println("\nAfter Insertion at End:");
        list.display();


        // Insert at position
        list.insertAtPosition(25, 3);

        System.out.println("\nAfter Insertion at Position 3:");
        list.display();


        // Delete at beginning
        list.deleteAtBeginning();

        System.out.println("\nAfter Deletion at Beginning:");
        list.display();


        // Delete at end
        list.deleteAtEnd();

        System.out.println("\nAfter Deletion at End:");
        list.display();


        // Delete at position
        list.deleteAtPosition(2);

        System.out.println("\nAfter Deletion at Position 2:");
        list.display();


        // Invalid position test
        System.out.println("\nInvalid Position Test:");
        list.deleteAtPosition(100);

        list.display();

    }
}

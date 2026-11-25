public class Test123{

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

    static class DoublyLinkedList {

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

        void displayForward(){

            Node temp = head;

            while(temp != null){

                System.out.print(temp.data + " ⇄ ");
                temp = temp.next;

            }

            System.out.println("null");
            System.out.println();

        }

        void displayBackward(){

            Node temp = head;

            while(temp.next != null){

                temp = temp.next;

            }

            while(temp != null){

                System.out.print(temp.data +" ⇄ ");
                temp = temp.prev;

            }

            System.out.println("null");
            System.out.println();

        }

        void deleteAtBeginning(){

            if(head == null){

                System.out.println("List is Empty");
                return;

            }

            if(head.next == null){

                head = null;
                return;

            }

            head = head.next;

            head.prev = null;


        }

        void deleteAtEnd(){

            if(head == null){

                System.out.println("List is empty");
                return;

            }

            if(head.next == null){

                head = null;
                return;

            }


            Node temp = head;

            while(temp.next != null){

                temp = temp.next;

            }

            temp.prev.next = null;

        }

    }

    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtBeginning(5);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        list.deleteAtBeginning();

        System.out.println("After deleting beginning:");
        list.displayForward();

        list.deleteAtEnd();

        System.out.println("After deleting end:");
        list.displayForward();



    }


}
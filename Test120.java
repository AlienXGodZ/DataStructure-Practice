public class Test120{

    static class Node{

        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;

        }

    }

    static class LinkedList{

        Node head;


        void insertatBeginning(int data){

        Node newnode = new Node(data);

        newnode.next = head;

        head = newnode;


    }

      void insertatending(int data){

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

        }

        void display(){

            Node temp = head;

            while(temp != null){

                System.out.print(temp.data + " --->");

                temp = temp.next;

            }

            System.out.print("null");

        }


    }


    public static void main(String[] args){

        LinkedList store = new LinkedList();

        store.insertatending(1);
        store.insertatending(2);
        store.insertatending(3);
        store.insertatBeginning(5);

        store.display();



    }
}
public class Test121{

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

        void insertatbeginning(int data){

            Node newnode = new Node(data);

            newnode.next = head;

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


        }

        void display(){

            Node temp = head;

            while(temp != null){

                System.out.print(temp.data + "---->");
                temp = temp.next;

            }

            System.out.print("Null");
            System.out.println();

        }

        void insertAtPosition(int data,int position){

            Node newnode = new Node(data);

            if(position == 0){

                newnode.next = head;

                head = newnode;

            }

            Node temp = head;

            for(int i = 0; i < position - 1; i++){

                if(temp == null){

                    System.out.println("Invalid Position");
                    return;

                }

                temp = temp.next;

            }

            newnode.next = temp.next;

            temp.next = newnode;

        }

        void deleteAtBeginning(){

            if(head == null){

                System.out.println("List is Empty");
                return;

            }

            head = head.next;

        }

        void deleteAtEnd(){

            if(head == null){

                System.out.println("List is Empty");
                return;

            }

            Node temp = head;

            while(temp.next.next != null){

                temp = temp.next;

            }

            temp.next = null;


        }

        void deleteAtPosition(int position){

            Node temp = head;

            if(head == null || position < 0){

                System.out.println("List is Empty:");
                return;

            }

            if(position == 0){

                head = head.next;

            }

            for(int i = 0; i < position - 1; i++){

                if(temp == null){

                    System.out.println("Invalid");
                    return;

                }

                temp = temp.next;


            }

            temp.next = temp.next.next;

        }

    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

        list.insertAtPosition(15, 1);
        list.display();

        list.deleteAtBeginning();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteAtPosition(1);
        list.display();

    }
}
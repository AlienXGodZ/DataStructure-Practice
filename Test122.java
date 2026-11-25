public class Test122 {

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

        void findlengthofLinkedList(){

            Node temp = head;

            int count = 0;

            while(temp != null){

                count++;

                temp = temp.next;

            }

            System.out.println(count);

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

        void search(int data){

            Node temp = head;


            while(temp != null){

                if(temp.data == data){

                    System.out.println("Founded");
                    return;

                }

                temp = temp.next;

            }

            System.out.println("Not Founded");

        }

        void middlenode(){

            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){

                slow = slow.next;

                fast = fast.next.next;


            }

            System.out.println(slow.data);


        }

        void nthnodefromtheEnd(int n){

            Node first = head;
            Node second = head;

            for(int i = 0; i < n; i++){

                if(first == null){

                    System.out.println("Invalid");
                    return;

                }

                first = first.next;

            }

            while(first != null){

                second = second.next;
                first = first.next;

            }

            System.out.println(second.data);

        }

        void reverselinkedList(){

            Node prev = null;

            Node current = head;

            Node next = null;

            while(current != null){

                next = current.next;

                current.next = prev;

                prev = current;

                current = next;


            }

            head = prev;

        }

    }


    public static void main(String[] args){

        LinkedList store = new LinkedList();

        store.insertatbeginning(3);
        store.insertatbeginning(2);
        store.insertatbeginning(1);

        store.display();

        store.findlengthofLinkedList();

        store.search(5);

        store.middlenode();

        store.nthnodefromtheEnd(1);

        store.reverselinkedList();

        store.display();


    }
}

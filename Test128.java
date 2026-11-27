public class Test128 {

    static class CircularQueue{

        int[] queue;
        int size;
        int front;
        int rear;

        CircularQueue(int size){

            this.size = size;

            queue = new int[size];

            this.front = -1;
            this.rear = -1;

        }

        void enqueue(int value){

            if( (rear + 1) % size  == front){

                System.out.println("Queue is full");
                return;

            }

            if(front == -1){

                front = 0;
                rear = 0;

            }else{

                rear = ( rear + 1 ) % size;

            }

            queue[rear] = value;

            System.out.println(value + "Inserted");

        }

        void dequeue(){

            if(front == -1){

                System.out.println("Queue is Empty");
                return;

            }

            int deleted = queue[front];

            if(front == rear){

                front = -1;
                rear = -1;

            }else{

                front = ( front + 1 ) % size;

            }

            System.out.println("Deleted: " + deleted);

        }

        void peek(){

            if(front == -1){

                System.out.println("Queue is empty");
                return;

            }

            System.out.println("Front Element: " + queue[front]);

        }

        void display(){

            if(front == -1){

                System.out.println("Queue is Empty");
                return;

            }

            int i = front;

            System.out.println("Queue: ");

            do{

                System.out.print(queue[i] + " ");

                i = ( i + 1 ) % size;

            }while(i != (rear + 1) % size);

            System.out.println();

        }

        boolean isEmpty(){

            return front == -1;

        }

        boolean isFull(){

            return (rear + 1) % size == front;

        }

    }

    public static void main(String[] args){

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.peek();

        q.display();

        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());


    }
}

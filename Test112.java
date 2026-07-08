import java.util.*;

 class TodoList{

     String todtask;

      TodoList(String todtask){

      this.todtask = todtask;

  }

    public String toString(){
          return "TODOLIST:" + todtask;
    }
 }


    class TodoList1{

        ArrayDeque<TodoList> store = new ArrayDeque<>();

        void addFirst(TodoList s){
            store.offerFirst(s);
        }

        void addLast(TodoList s){
            store.offerLast(s);
        }

        void add(TodoList s){
            store.offer(s);
        }

        void completeFirstTask() {

            if (store.isEmpty()) {
                System.out.println("\nTask is not Found");
            } else {

                System.out.println("\n Completed: " + store.pollFirst());

            }
        }

        void removeLastTask() {

            if (store.isEmpty()) {
                System.out.println("\nTask is not Found");
            } else {

                System.out.println("\nTask Removed: " + store.pollLast());

            }
        }

        void viewFirstTask() {

            if (store.isEmpty()) {
                System.out.println("\nTask is not Found");
            } else {

                System.out.println("\nFirst Task: " + store.peekFirst());

            }
        }

        void viewLastTask() {

            if (store.isEmpty()) {
                System.out.println("\nTask is not Found");
            } else {

                System.out.println("\nlast Task: " + store.peekLast());

            }
        }

        void display() {

            if (store.isEmpty()) {
                System.out.println("\nNo Task Founded");
            } else {
                System.out.println("\nTask Founded: ");

                for (TodoList i : store) {

                    System.out.println(i);
                }
            }
        }

        void count(){
            System.out.println("\nNumber of Tasktodo: " + store.size());
        }

        void checkEmpty(){

            if(store.isEmpty()){
                System.out.println("\nTask is empty");
            }else{
                System.out.println("\nTask is Not Empty");
            }


        }


    }


public class Test112 {
    public static void main(String[] args){

        TodoList1 s1 = new TodoList1();

        s1.addFirst(new TodoList("WakeUp"));
        s1.add(new TodoList("Study Java"));
        s1.add(new TodoList("Complete DSA"));
        s1.add(new TodoList("Exercise"));
        s1.addLast(new TodoList("Sleep"));
        s1.add(new TodoList("Dinner"));


        s1.completeFirstTask();

        s1.display();

        s1.removeLastTask();

        s1.viewLastTask();

        s1.viewFirstTask();

        s1.checkEmpty();

        s1.count();




    }
}

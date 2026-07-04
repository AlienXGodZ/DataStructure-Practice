import java.util.*;

 class studentss {
     int id;
     String name;
     int mark;

     studentss(int id, String name, int mark) {
         this.id = id;
         this.name = name;
         this.mark = mark;
     }

     public String toString(){

         return "Student ID :" + id + "|Student Name :" + name + "|Student mark:" + mark;

     }
 }

     class studentmanagementproject{

         ArrayList<studentss> store = new ArrayList<>();

         void addStudent(studentss s){
             store.add(s);
         }


     void search(String s){

         boolean condition = false;

         for(studentss i : store){

             if(i.name.equals(s)){
                 System.out.println("\nStudent Founded:" + i);
                 condition = true;
                 break;
             }
         }
         if(!condition){
             System.out.println("\nStudent Not Found");
         }
         }

         void update (String s  , int m){

             boolean condition = false;

             for(studentss i : store){
                 if(i.name.equals(s)){
                     i.mark = m;
                     System.out.println("\nUpdated: " + i);
                     condition = true;
                     break;
                 }
             }

             if(!condition){
                 System.out.println("\nNot Updated");
             }
         }

         void remove(int id){

             boolean condition = false;
             Iterator<studentss> loop = store.iterator();

             while(loop.hasNext()){
                 studentss search = loop.next();

                 if(search.id == id){
                     loop.remove();
                     condition = true;
                     System.out.println("\nSuccessfully Student removed");
                     break;
                 }
             }
             if(!condition){
                 System.out.println("\nStudent is not founded or remove");
             }
         }

         void display(){

             System.out.println("\nStudent List:");

             for(studentss i : store){

                 System.out.println(i);

             }
         }

          void sortname() {

             Collections.sort(store, new Comparator<studentss>() {
                 @Override
                 public int compare(studentss s1, studentss s2) {
                     return s1.name.compareTo((s2.name));
                 }
             });

             System.out.println("\nSorted By Name:" + store);

          }


          void sortmark(){

              Collections.sort(store, new Comparator<studentss>() {
                  @Override
                  public int compare(studentss s1, studentss s2) {
                      return Integer.compare(s1.mark,s2.mark);
                  }
              });

              System.out.println("\nSorted By mark:" + store);

          }

          void countStudent(){

             System.out.println("\nThe Number of Student:" + store.size());

          }

         void studentExists(String name) {

             for (studentss s : store) {
                 if (s.name.equals(name)) {
                     System.out.println("\nStudent Exists");
                     return;
                 }
             }

             System.out.println("\nStudent Does Not Exist");
         }




     }


     public class Test94{
       public static void main(String[] args){

           studentmanagementproject s = new studentmanagementproject();


           s.addStudent(new studentss(101,"Allen",90));
           s.addStudent(new studentss(102,"Joan",45));
           s.addStudent(new studentss(103,"Harvey",85));
           s.addStudent(new studentss(104,"Bala",65));
           s.addStudent(new studentss(105,"Dhanusha",98));


           s.display();

           s.search("Joan");

           s.countStudent();

           s.update("Joan",50);

           s.sortmark();

           s.sortmark();

           s.remove(105);

           s.display();

           s.studentExists("Allen");



       }




 }
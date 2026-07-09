import java.util.*;

 class visitor{

     String name;

     visitor(String name){
         this.name = name;
     }


     public String toString(){
         return "VISITOR NAME: " + name;
     }
     public boolean equals(Object obj){

         if(this == obj){
             return true;
         }

         if(!(obj instanceof visitor)){
             return false;
         }

         visitor others = (visitor) obj;
         return this.name.equals(others.name);
     }

     public int hashCode(){
         return name.hashCode();
     }

 }

  class visittracker {

      HashSet<visitor> store = new HashSet<>();

      void add(visitor s) {
          store.add(s);
      }

      void display() {

          System.out.println("\nVisitor List:");
          for (visitor i : store) {
              System.out.println(i);
          }
      }

      void visitExist(String name) {

          for (visitor i : store) {
              if (i.name.equals(name)) {
                  System.out.println("\nEXIST:" + i);
                  return;
              }
          }
          System.out.println("\nNOT EXIST");
      }

      void remove(String visitorname) {

          Iterator<visitor> loop = store.iterator();

          while (loop.hasNext()) {
              visitor i = loop.next();

              if (i.name.equals(visitorname)) {
                  loop.remove();
                  System.out.println("\nRemoved Successfully:" + i);
                  return;
              }
          }
          System.out.println("\nNot Removed");
      }


      void countvisitor() {
          System.out.println("\nNumber Of visitor: " + store.size());
      }

      void removeall() {
          store.clear();
      }

      void isempty() {

          if (store.isEmpty()) {
              System.out.println("\nNo Visitor");
          } else {
              System.out.println("\nVisitor Founded");
          }

      }
  }

public class Test114 {
    public static void main(String[] args){

        visittracker s = new visittracker();

        s.add(new visitor("Allen"));
        s.add(new visitor("Allen"));
        s.add(new visitor("Joan"));
        s.add(new visitor("Harvey"));
        s.add(new visitor("Harley"));
        s.add(new visitor("Bala"));


        s.display();

        s.countvisitor();

        s.isempty();

        s.remove("bala");

        s.visitExist("Harley");

        s.removeall();

    }
}

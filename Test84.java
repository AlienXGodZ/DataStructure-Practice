import java.util.*;

  class schoolStudent {
      String name;
      int mark;

      schoolStudent(String name, int mark) {
          this.name = name;
          this.mark = mark;
      }

      public String toString() {
          return name + " : " + mark;
      }
  }



       class StudentName1 implements Comparator<schoolStudent> {

          public int compare(schoolStudent s1, schoolStudent s2) {
              return s1.name.compareTo(s2.name);
          }
      }

       class StudentMark1 implements Comparator<schoolStudent> {

          public int compare(schoolStudent s1, schoolStudent s2) {
              return Integer.compare(s1.mark,s2.mark);
          }
      }


  public class Test84{
      public static void main(String[] args){

          ArrayList<schoolStudent> store = new ArrayList<>();

          store.add(new schoolStudent("Allen",50));
          store.add(new schoolStudent("Joan",20));
          store.add(new schoolStudent("Harrish",40));
          store.add(new schoolStudent("Harvey",90));
          store.add(new schoolStudent("Harlish",85));

          System.out.println(store);

         boolean found = false;
          for(schoolStudent i : store){
              if(i.name.equals("Joan")){

                  System.out.println("Found Index At: " + store.indexOf(i) + " " + "Successfully Find: " + store.get(store.indexOf(i)));
                  found = true;
                  break;
              }
          }

          if(found == false){
              System.out.println("Sir we cannot Find");
          }

          for(schoolStudent i : store){
              if(i.name.equals("Harvey")) {
                  i.mark = 95;
              }
          }

          System.out.println(store);

          Iterator<schoolStudent> loop = store.iterator();

              while(loop.hasNext()){
                  schoolStudent s = loop.next();
                  if(s.name.equals("Harlish")) {
                      loop.remove();
                  }
          }




          Collections.sort(store, new StudentName1());
              System.out.println(store);


          Collections.sort(store, new StudentMark1());
            System.out.println(store);



          System.out.println("\nTotal Students : " + store.size());

          boolean exists = false;

          for (schoolStudent s : store) {
              if (s.name.equals("Harvey")) {
                  exists = true;
                  break;
              }
          }

          System.out.println("\nHarvey Exists : " + exists);





      }
  }





















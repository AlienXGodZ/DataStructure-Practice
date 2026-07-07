import java.util.*;

  class hospitalmanagementsystem1 {

      String name;
      String disease;
      int age;

      hospitalmanagementsystem1(String name, String disease, int age) {

          this.name = name;
          this.disease = disease;
          this.age = age;

      }

      public String toString() {
          return "PATIENT NAME:" + name + "PATIENT DISEASE: " + disease + "PATIENT AGE: " + age;
      }
  }

  class hospitalmanagementsystem2{

      HashMap<Integer,hospitalmanagementsystem1> store = new HashMap<>();

      void add(int id , hospitalmanagementsystem1 s){

          store.put(id,s);

      }


      void display(){

          System.out.println("\nHOSPITAL FULL LIST:");

          for(Map.Entry<Integer,hospitalmanagementsystem1> loop : store.entrySet()){

              System.out.println("PATIENT ID: "
                      + loop.getKey() + "|" + "PATIENT NAME: "
                      + loop.getValue().name + "|" + "PATIENT DISEASE: "
                      + loop.getValue().disease + "|" + "PATIENT AGE: "
                      + loop.getValue().age );
          }
      }

      void search(int id){

          if(store.containsKey(id)){
              System.out.println("\nFounded!: " + store.get(id).name + "|" + store.get(id).disease + "|" + store.get(id).age);
          }else{
              System.out.println("\nNot Found");
          }
      }

      void searchname (String patientname) {

          for (Map.Entry<Integer, hospitalmanagementsystem1> loop : store.entrySet()) {

              if (loop.getValue().name.equals(patientname)) {
                  System.out.println("\nFOUNDED!: " + patientname);
                  return;
              }
          }
          System.out.println("\n Not Founded");
      }

      void update(int id , String Disease){

          if(store.containsKey(id)){
              store.get(id).disease = Disease;
              System.out.println("\n Updated: " + store.get(id).name + "|" + Disease + "|" + store.get(id).age);
          }else{
              System.out.println("\n Not Updated");
          }
      }

      void exists(String PatientName){

          for(Map.Entry<Integer,hospitalmanagementsystem1> loop : store.entrySet()){

          if(loop.getValue().name.equals(PatientName)){
               System.out.println("\nPatient Exist: " + loop.getKey() + "|" +
                       loop.getValue().name + "|" +
                       loop.getValue().disease + "|" +
                       loop.getValue().age);
                return;
              }
      }
          System.out.println("\nNOT EXISTS");
  }

  void total(){

      System.out.println("\nNumber of Patient:" + store.size());

      }


      void remove(String PatientName){

          Iterator<Map.Entry<Integer,hospitalmanagementsystem1>> loop = store.entrySet().iterator();

          while(loop.hasNext()){

              Map.Entry<Integer,hospitalmanagementsystem1> i = loop.next();

              if(i.getValue().name.equals(PatientName)){

                  loop.remove();
                  System.out.println("\n Removed Successfully");
                  return;
              }
          }
          System.out.println("\n Not Removed");

      }

      void sortbyid() {

          System.out.println("\nSORTED BY ID:");

          TreeMap<Integer,hospitalmanagementsystem1> sorted = new TreeMap<>(store);

          for(Map.Entry<Integer,hospitalmanagementsystem1> i : sorted.entrySet()){

              System.out.println("PATIENT ID:" + i.getKey() +
                      "PATIENT NAME: " + i.getValue().name  +
                      "PATIENT AGE: " + i.getValue().age +
                      "PATIENT DISEASE: "
                      + i.getValue().disease);

          }
      }

      void sortbyname(){

          List<Map.Entry<Integer,hospitalmanagementsystem1>> list = new ArrayList<>(store.entrySet());

          Collections.sort(list, new Comparator<Map.Entry<Integer,hospitalmanagementsystem1>>(){

             public int compare(Map.Entry<Integer,hospitalmanagementsystem1>  s1 , Map.Entry<Integer,hospitalmanagementsystem1> s2){

                 return s1.getValue().name.compareTo(s2.getValue().name);
             }
          });

          System.out.println("\n SORTED BY NAME:");

          for(Map.Entry<Integer,hospitalmanagementsystem1> i : list){

              System.out.println("PATIENT ID: " + i.getKey() + "|" +
                      "PATIENT NAME: " + i.getValue().name + "|" +
                      "PATIENT DISEASE: " + i.getValue().disease + "|" +
                      "PATIENT AGE: " + i.getValue().age);
          }
      }
  }

public class Test108 {
    public static void main(String[] args){

        hospitalmanagementsystem2 s = new hospitalmanagementsystem2();

        s.add(101,new hospitalmanagementsystem1("ALLEN","ULCER",20));
        s.add(102,new hospitalmanagementsystem1("JOAN","SUGAR",18));
        s.add(103,new hospitalmanagementsystem1("Stella","LOW BLOOD CIRCLUATION",22));
        s.add(104,new hospitalmanagementsystem1("Harvey","CANCER",14));
        s.add(105,new hospitalmanagementsystem1("Dhanusha","HOMOFIYA",20));


        s.search(105);

        s.searchname("Stella");

        s.update(104,"CORANA");
        s.display();

        s.total();

        s.remove("Harvey");

        s.exists("Harvey");

        s.exists("ALLEN");

        s.display();

        s.sortbyid();

        s.sortbyname();

    }
}

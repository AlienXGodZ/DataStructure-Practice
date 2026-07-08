import java.util.*;

 class website{
     String websitename;

  website(String websitename){
      this.websitename = websitename;
  }

   public String toString(){
      return "WEBSITE NAME: " + websitename;
   }
 }

  class websitehistory{

     Stack<website> store = new Stack<>();

     void visitWebsite(website WebsiteName){
         store.push(WebsiteName);
     }

     void back(){

         if(store.isEmpty()){
             System.out.println("\nThere is not History");
         }else{
             store.pop();
             System.out.println("\nThere is History:" + store.peek());
         }
     }

     void currentWebsite(){

         if(store.isEmpty()){
             System.out.println("\nNo Website we can see");
         }else{
             System.out.println("\nCUURENT WEBSITE: " + store.peek());
         }
     }

     void displayHistory() {

         if (store.isEmpty()) {
             System.out.println("\nThere is no History");
         } else {

             for (website i : store) {
                 System.out.println(i);
             }
         }
     }

     void countHistory(){

         System.out.println("\nNumber of History:" + store.size());

     }

     void clearHistory(){

         store.clear();
        System.out.println("\nHistory Deleted: ");

     }

     void isHistoryEmpty() {

         if (store.isEmpty()) {
             System.out.println("\nHistory is Deleted");
         } else {
             System.out.println("\nHistory is Deleted");
         }
     }

     void sortWebsitename(){

         System.out.println();

         List<website> list = new ArrayList<>(store);

         Collections.sort(list, new Comparator<website>() {

            public int compare(website s1 , website s2){

                return s1.websitename.compareTo(s2.websitename);
            }
         });

         for(website i : list){

             System.out.println(i);

         }


     }
  }

public class Test110 {
    public static void main(String[] args){

        websitehistory s = new websitehistory();

        s.visitWebsite(new website("Chatgypt"));
        s.visitWebsite(new website("GitHub"));
        s.visitWebsite(new website("youtube"));
        s.visitWebsite(new website("Google"));


        s.countHistory();

        s.currentWebsite();

        s.back();

        s.currentWebsite();

        s.countHistory();

        s.displayHistory();

        s.sortWebsitename();

        s.clearHistory();

        s.isHistoryEmpty();




    }
}

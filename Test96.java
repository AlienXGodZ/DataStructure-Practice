import java.util.*;

  class library{

      int bookid;
      String bookname;
      String booktitle;
      String bookauthor;


      library(int bookid,String bookname , String booktitle , String bookauthor){
          this.bookid = bookid;
          this.bookname = bookname;
          this.booktitle = booktitle;
          this.bookauthor = bookauthor;
      }

      public String toString(){
          return "BOOK ID: " + bookid + "| BOOK NAME: " + bookname + "| BOOK TITLE: " + booktitle + "| BOOK AUTHOR: " + bookauthor;
      }
  }

     class libraryManagementSystem{

       ArrayList<library> store = new ArrayList<>();

       void add(library s){
           store.add(s);
       }

       void display(){
           System.out.println("\nLibrary List");

           for(library i : store){
               System.out.println(i);
           }
       }

       void Search(String name){

           for(library i : store){
               if(i.bookname.equals(name)){
                   System.out.println("\nBook Founded" + i);
                   return;
               }
           }
           System.out.println("\nBook Not Founded");
       }

       void update(String name,String author){

           for(library i : store){

               if(i.bookname.equals(name)){
                   i.bookauthor = author;
                   System.out.println("\nSuccessfully Updated" + i);
                   return;
               }
           }
           System.out.println("\nNot Updated");
       }

        void remove(String author){

          Iterator<library> loop = store.iterator();

             while(loop.hasNext()){
                 library x = loop.next();

                 if(x.bookauthor.equals(author)){
                     loop.remove();
                     System.out.println("\nSuccessully Removed" + x);
                     return;
                 }
              }
             System.out.println("NOt removed");
          }


        void sortBookName(){

           Collections.sort(store, new Comparator<library>(){

                public int compare(library s1 , library s2){

                    return s1.bookname.compareTo(s2.bookname);
                }
           });
        }

         void sortBookAuthor(){

             Collections.sort(store, new Comparator<library>(){

                 public int compare(library s1 , library s2){

                     return s1.bookauthor.compareTo(s2.bookauthor);
                 }
             });
         }

         void total() {

           System.out.println("\nNumber of Books: " + store.size());
         }

         void exists(String author){

           for(library i : store){
               if(i.bookauthor.equals(author)) {
                   System.out.println("\nBook is in Stock" + i);
                   return;
               }
           }
             System.out.println("\nBook is not in stock");
         }

    }

public class Test96 {
    public static void main(String[] args){

          libraryManagementSystem s = new libraryManagementSystem();

          s.add(new library(101,"Albert Einstien","Electricity","by robert"));
        s.add(new library(102,"Robert Einstien","Water","by albert"));
        s.add(new library(103,"Allen Einstien","Matter","by allen"));
        s.add(new library(104,"Joan Einstien","Sky","by joan"));
        s.add(new library(105,"Bala Einstien","Velocity","by bala"));
        s.add(new library(106,"Dhanusha Einstien","Moleclus","by dhanusha"));

        s.display();

        s.Search("Bala Einstien");

        s.exists("by joan");

        s.remove("by dhanusha");

        s.total();

        s.update("Allen Einstien","by allenharvey");

        s.sortBookAuthor();
        s.display();

        s.sortBookName();
        s.display();





    }
}

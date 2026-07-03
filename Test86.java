import java.util.*;

 class LibraryBook {
     int id;
     String title;
     String author;


     LibraryBook(int id,String title,String author){
         this.id = id;
         this.title = title;
         this.author = author;
     }

     public String toString(){
         return "Book ID: " + id + " | Book Title: " + title + " | Book Author: " + author;
     }
 }

  class BookId implements Comparator<LibraryBook>{

     public int compare(LibraryBook s1, LibraryBook s2){
         return Integer.compare(s1.id,s2.id);
     }
  }

  class BookTitle implements Comparator<LibraryBook>{

     public int compare(LibraryBook s1 , LibraryBook s2){
         return s1.title.compareTo(s2.title);
     }
  }

public class Test86 {
    public static void main(String[] args){

        ArrayList<LibraryBook> store = new ArrayList<>();

        store.add(new LibraryBook(9123,"The Chair","By Robert"));
        store.add(new LibraryBook(9124,"The Pant","By Albert"));
        store.add(new LibraryBook(9125,"The Sweat","By Sony"));
        store.add(new LibraryBook(9126,"The Hulk","By GreenSea"));
        store.add(new LibraryBook(9127,"The Sleeping Town","By SleepMaster"));

        System.out.println(store);

        boolean found1 = false;
        for(LibraryBook i : store){
            if(i.id == 9125){
                System.out.println("Founded: " + i);
                found1 = true;
                break;
            }
        }

          if(!found1){
              System.out.println("Book ID is not FOUND!");
          }

        boolean found2 = false;
        for(LibraryBook i : store){
            if(i.author.equals("By Sony")){
                i.author = "By Allen";
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Not FOUND!");
        }


        boolean found3 = false;
        Iterator<LibraryBook> loop = store.iterator();

        while(loop.hasNext()){

            LibraryBook it = loop.next();

            if(it.title.equals("The Hulk")){
               loop.remove();
               System.out.println(store);
               found3 = true;
               break;
            }
        }

         if(!found3){
             System.out.println("Not Found");
         }

         Collections.sort(store, new BookId());
         System.out.println("Sorted by ID: " + store);

         Collections.sort(store, new BookTitle());
         System.out.println("Sorted by Title: " + store);


         System.out.println(store.size());

        boolean found4 = false;
        for(LibraryBook i : store){
            if(i.id == 9126){
                System.out.println("Sir Book in Stock");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Book is Not in stock");
        }


        store.set(3,new LibraryBook(9123,"The chair","By Robert"));
        System.out.println(store);


        }
    }


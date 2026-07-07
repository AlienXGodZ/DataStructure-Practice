import java.util.*;

    class libraryManagementSystem1{
        String bookname;
        String bookauthor;
        double price;


        libraryManagementSystem1(String bookname,String bookauthor,double price){

            this.bookname = bookname;
            this.bookauthor = bookauthor;
            this.price = price;

        }

        public String toString(){
            return "BookName:" + bookname + "|" +"BookAuthor:" + bookauthor;
        }
    }

   class libraryManagementSystem2{

        HashMap<Integer,libraryManagementSystem1> store = new HashMap<>();

        void add(int id,libraryManagementSystem1 s){
            store.put(id,s);
        }

        void display(){

            System.out.println("\nLibrary list:");

            for(Map.Entry<Integer,libraryManagementSystem1> loop : store.entrySet() ){

                System.out.println("LIBRARY BOOKID:" + loop.getKey() + "|" +
                        "LIBRARY BOOK NAME: " + loop.getValue().bookname + "|" +
                        "LIBRARY BOOK AUTHOR: " + loop.getValue().bookauthor + "|" +
                        "LIBRARY BOOK PRICE: " + loop.getValue().price );
            }
        }

        void searchid(int bookid){

            if(store.containsKey(bookid)){
                System.out.println("\n BookFounded: " + "|" + store.get(bookid).bookname + "|" + store.get(bookid).bookauthor + "|"+ store.get(bookid).price);
            }else{
                System.out.println("\n Book is not Found!");
            }
        }

        void searchname(String bookname){

            for(Map.Entry<Integer,libraryManagementSystem1> loop : store.entrySet()){

                if(loop.getValue().bookname.equals(bookname)){
                    System.out.println("\n BookFounded!: " + "|" +loop.getKey() + "|" +
                            loop.getValue().bookname + "|" +
                            loop.getValue().bookauthor + "|" +
                            loop.getValue().price );
                    return;
                }
            }
            System.out.println("\n Book is not Found");
        }

        void update(int id , String bookname){

            if(store.containsKey(id)){
                store.get(id).bookname = bookname;
                System.out.println("\n Book Updated" + "|" +id + "|" +store.get(id).bookname + "|" +store.get(id).bookauthor );
            }else{
                System.out.println("\n Book not Updated");
            }
        }

        void exist(int id ){

            if(store.containsKey(id)){
                System.out.println("\nExist: " + id + "|" + store.get(id).bookname + " |" + store.get(id).bookauthor + "|" + store.get(id).price);
            }else{
                System.out.println("\nNot Exist");
            }
        }

        void remove(String bookname){

            Iterator<Map.Entry<Integer,libraryManagementSystem1>> loop = store.entrySet().iterator();

            while(loop.hasNext()){
                Map.Entry<Integer,libraryManagementSystem1> i = loop.next();
                  if(i.getValue().bookname.equals(bookname)){
                      loop.remove();
                      System.out.println("\nSuccessfully Removed");
                      return;
                  }
            }
            System.out.println("\nNot Removed");
        }

        void total(){
            System.out.println("\nNumber of LibraryBook:" + store.size());
        }

        void sortid(){

            System.out.println("\nSORTED BY ID");

            TreeMap<Integer,libraryManagementSystem1> sorted = new TreeMap<>(store);

            for(Map.Entry<Integer,libraryManagementSystem1> i : sorted.entrySet()){

                System.out.println("BOOK ID: " + i.getKey() +
                        "BOOK NAME: " + i.getValue().bookname +
                        "BOOK AUTHOR: " + i.getValue().bookauthor +
                        "BOOK PRICE:" + i.getValue().price);
            }
        }

        void sortbookname(){

           List<Map.Entry<Integer,libraryManagementSystem1>> list = new ArrayList<>(store.entrySet());

           Collections.sort(list, new Comparator<Map.Entry<Integer,libraryManagementSystem1>>(){

               public int compare(Map.Entry<Integer,libraryManagementSystem1> s1 , Map.Entry<Integer,libraryManagementSystem1> s2){

                   return s1.getValue().bookname.compareTo(s2.getValue().bookname);
               }
           });

           System.out.println("\nSORTED BY NAME");

           for(Map.Entry<Integer,libraryManagementSystem1> i : list){

               System.out.println("BOOK NAME: " + i.getValue().bookname + "|" +
                       "BOOK ID: " + i.getKey() + "|" +
                       "BOOK AUTHOR: " + i.getValue().bookauthor);

           }
        }
   }



public class Test107 {
    public static void main(String[] args){

        libraryManagementSystem2 s = new libraryManagementSystem2();

        s.add(101, new libraryManagementSystem1("THE CHAIR","By Robert",1000));
        s.add(102, new libraryManagementSystem1("THE HULK", "By Albert",2000));
        s.add(103,new libraryManagementSystem1("THE KITTY","By Dhanush",10000));
        s.add(105,new libraryManagementSystem1("THE BATMAN","By Joshuva",500));
        s.add(106, new libraryManagementSystem1("THE IRONMAN","By Tony",100000));


        s.searchid(102);

        s.searchname("THE IRONMAN");

        s.update(101,"THE CHAIR PART1");
        s.display();

        s.remove("THE KITTY");

        s.exist(103);

        s.exist(106);

        s.total();

        s.sortbookname();

        s.sortid();


    }
}

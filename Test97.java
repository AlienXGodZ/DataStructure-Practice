import java.util.*;

class movie3 {
    int id;
    String name;
    double rating;

    movie3(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String toString(){

        return "Movie ID :" + id + "|Movie Name :" + name + "|Movie Rating:" + rating;

    }
}

class MovieCollection{

    ArrayList<movie3> store = new ArrayList<>();

    void addmovie(movie3 s){
        store.add(s);
    }


    void search(String s){

        boolean condition = false;

        for(movie3 i : store){

            if(i.name.equals(s)){
                System.out.println("\nMovie Founded:" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nMovie Not Found");
        }
    }

    void update (String s  , double m){

        boolean condition = false;

        for(movie3 i : store){
            if(i.name.equals(s)){
                i.rating = m;
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
        Iterator<movie3> loop = store.iterator();

        while(loop.hasNext()){
            movie3 search = loop.next();

            if(search.id == id){
                loop.remove();
                condition = true;
                System.out.println("\nSuccessfully Movie removed: " + search);
                break;
            }
        }
        if(!condition){
            System.out.println("\nMovie is not founded or remove");
        }
    }

    void display(){

        System.out.println("\nMovie List:");

        for(movie3 i : store){

            System.out.println(i);

        }
    }

    void sortname() {

        Collections.sort(store, new Comparator<movie3>() {
            @Override
            public int compare(movie3 s1, movie3 s2) {
                return s1.name.compareTo((s2.name));
            }
        });

        System.out.println("\nSorted By Name:" + store);

    }


    void sortrating(){

        Collections.sort(store, new Comparator<movie3>() {
            @Override
            public int compare(movie3 s1, movie3 s2) {
                return Double.compare(s1.rating,s2.rating);
            }
        });

        System.out.println("\nSorted By mark:" + store);

    }

    void countmovie(){

        System.out.println("\nThe Number of Movie:" + store.size());

    }

    void movieExists(String name) {

        for (movie3 s : store) {
            if (s.name.equals(name)) {
                System.out.println("\nMovie Exists");
                return;
            }
        }

        System.out.println("\nMovie Does Not Exist");
    }
}

public class Test97{
    public static void main(String[] args){

        MovieCollection s = new MovieCollection();


        s.addmovie(new movie3(101,"Thupakki",5.3));
        s.addmovie(new movie3(102,"Kaithi",4.5));
        s.addmovie(new movie3(103,"Vikram",5.4));
        s.addmovie(new movie3(104,"Thani oruvan",5.2));
        s.addmovie(new movie3(105,"Comeback",3.0));


        s.display();

        s.search("Vikram");

        s.countmovie();

        s.update("Comeback",1.0);

        s.sortname();

        s.sortrating();

        s.remove(105);

        s.display();

        s.movieExists("Comeback");



    }




}
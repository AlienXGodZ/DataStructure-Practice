import java.util.*;

class Movie {
    int MovieId;
    String MovieName;
    double Rating;


    Movie(int MovieId, String MovieName, double Rating){
        this.MovieId = MovieId;
        this.MovieName = MovieName;
        this.Rating = Rating;
    }

    public String toString(){
        return "Movie ID: " + MovieId + " | Movie Name: " + MovieName + " | Rating: " + Rating;
    }
}

class Movieid1 implements Comparator<Movie> {

    public int compare(Movie s1, Movie s2) {
        return Integer.compare(s1.MovieId, s2.MovieId);
    }
}


class MovieName1 implements Comparator<Movie>{

    public int compare(Movie s1 , Movie s2){
        return s1.MovieName.compareTo(s2.MovieName);
    }
}

class MovieRating implements Comparator<Movie>{

    public int compare(Movie s1, Movie s2){
        return Double.compare(s1.Rating,s2.Rating);
    }
}

public class Test87 {
    public static void main(String[] args){

        ArrayList<Movie> store = new ArrayList<>();

        store.add(new Movie(101,"LEO",8.5));
        store.add(new Movie(102,"VIKRAM",9.2));
        store.add(new Movie(103,"MASTER",9.0));
        store.add(new Movie(104,"KAITHI",8.0));
        store.add(new Movie(105,"Jailer",8.8));

        System.out.println(store);

        boolean found1 = false;
        for(Movie i : store){
            if(i.MovieName.equals("Jailer")){
                System.out.println("Founded: " + i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Movie is not FOUND!");
        }

        boolean found2 = false;
        for(Movie i : store){
            if(i.MovieName.equals("MASTER")){
                i.MovieName = "Master Allen";
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Not FOUND!");
        }


        boolean found3 = false;
        Iterator<Movie> loop = store.iterator();

        while(loop.hasNext()){

            Movie it = loop.next();

            if(it.MovieName.equals("KAITHI")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Not Found");
        }

        Collections.sort(store, new Movieid1());
        System.out.println("Sorted by MovieId: " + store);

        Collections.sort(store, new MovieName1());
        System.out.println("Sorted by MovieName: " + store);


        System.out.println("Number of Movies: "+ store.size());

        boolean found4 = false;
        for(Movie i : store){
            if(i.MovieName.equals("VIKRAM")){
                System.out.println("Sir Movie is Available");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Movie is not Available");
        }


        store.set(3,new Movie(101,"Kabali",10));
        System.out.println(store);


    }
}


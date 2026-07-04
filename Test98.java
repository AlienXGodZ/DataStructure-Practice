import java.util.*;


class contactbook{

    String name;
    String number;
    String email;


    contactbook(String name , String number , String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String toString(){
        return "CONTACT NAME: " + name + "| CONTACT NUMBER: " + number + "| CONTACT EMAIL: " + email;
    }
}

class contactcollection{

    ArrayList<contactbook> store = new ArrayList<>();

    void add(contactbook s){
        store.add(s);
    }

    void display(){
        System.out.println("\nContact List");

        for(contactbook i : store){
            System.out.println(i);
        }
    }

    void Search(String name){

        for(contactbook i : store){
            if(i.name.equals(name)){
                System.out.println("\nContact Founded" + i);
                return;
            }
        }
        System.out.println("\nContact Not Founded");
    }

    void update(String name,String email){

        for(contactbook i : store){

            if(i.name.equals(name)){
                i.email = email;
                System.out.println("\nSuccessfully Updated" + i);
                return;
            }
        }
        System.out.println("\nNot Updated");
    }

    void remove(String number){

        Iterator<contactbook> loop = store.iterator();

        while(loop.hasNext()){
            contactbook x = loop.next();

            if(x.number.equals(number)){
                loop.remove();
                System.out.println("\nSuccessully contact Removed" + x);
                return;
            }
        }
        System.out.println("NOt removed");
    }


    void sortName(){

        Collections.sort(store, new Comparator<contactbook>(){

            public int compare(contactbook s1 , contactbook s2){

                return s1.name.compareTo(s2.name);
            }
        });
    }

    void sortemail(){

        Collections.sort(store, new Comparator<contactbook>(){

            public int compare(contactbook s1 , contactbook s2){

                return s1.email.compareTo(s2.email);
            }
        });
    }

    void total() {

        System.out.println("\nNumber of Contact: " + store.size());
    }

    void exists(String name){

        for(contactbook i : store){
            if(i.name.equals(name)) {
                System.out.println("\nContact exists" + i);
                return;
            }
        }
        System.out.println("\nContact is not exist");
    }

}

public class Test98 {
    public static void main(String[] args){

        contactcollection s = new contactcollection();

        s.add(new contactbook("Albert","000000000","albert@gmail.com"));
        s.add(new contactbook("Robert","11111111","robert@gmail.com"));
        s.add(new contactbook("Allen","222222222","allen@gmail.com"));
        s.add(new contactbook("Joan","333333333","Joan@gmail.com"));
        s.add(new contactbook("Bala","44444444","bala@gmail.com"));
        s.add(new contactbook("Dhanusha","5555555","dhanusha@gmail.com"));

        s.display();

        s.Search("Robert");

        s.exists("joan");

        s.remove("44444444");

        s.total();

        s.update("Allen","allenharvey@gmail.com");

        s.sortemail();
        s.display();

        s.sortName();
        s.display();





    }
}

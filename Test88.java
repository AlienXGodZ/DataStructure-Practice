import java.util.*;

class ContactBook {
    String name;
    String number;
    String email;


    ContactBook(String name, String number, String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String toString(){
        return "Name: " + name + " | Number: " + number + " | Email: " + email;
    }
}

class contactNumber implements Comparator<ContactBook> {

    public int compare( ContactBook s1, ContactBook s2) {
        return s1.number.compareTo(s2.number);
    }
}


class contactName implements Comparator<ContactBook>{

    public int compare(ContactBook s1 , ContactBook s2){
        return s1.name.compareTo(s2.name);
    }
}



public class Test88 {
    public static void main(String[] args){

        ArrayList<ContactBook> store = new ArrayList<>();

        store.add(new ContactBook("Allen","1234567890","allen@gmail.com"));
        store.add(new ContactBook("Joan","2222222222","joan@gmail.com"));
        store.add(new ContactBook("Harvey","3333333333","harvey@gmail.com"));
        store.add(new ContactBook("Bala","4444444444","bala@gmail.com"));
        store.add(new ContactBook("Dhanusha","5555555555","dhanusha@gmail.com"));

        System.out.println(store);

        boolean found1 = false;
        for(ContactBook i : store){
            if(i.name.equals("Allen")){
                System.out.println("Founded: " +i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Contact is not FOUND!");
        }

        boolean found2 = false;
        for(ContactBook i : store){
            if(i.number.equals("4444444444")){
                i.number = "00000000000";
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Contact Not FOUND!");
        }


        boolean found3 = false;
        Iterator<ContactBook> loop = store.iterator();

        while(loop.hasNext()){

            ContactBook it = loop.next();

            if(it.name.equals("Joan")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Contact Not Found");
        }

        Collections.sort(store, new contactName());
        System.out.println("Sorted by ContactedName: " + store);

        Collections.sort(store, new contactNumber());
        System.out.println("Sorted by ContactNumber: " + store);


        System.out.println("Number of Contact: "+ store.size());

        boolean found4 = false;
        for(ContactBook i : store){
            if(i.name.equals("Dhanusha")){
                System.out.println("Sir contact is Available");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Contact is not Available");
        }


        store.set(3,new ContactBook("SecretAgent","0000000007","TopSecret"));
        System.out.println(store);


    }
}


import java.util.*;

class customer {
    String name;
    String accountNumber;
    int balance;


    customer(String name, String accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString(){
        return "Name: " + name + " | AccountNumber: " + accountNumber + " | Balance: " + balance;
    }
}

class customerName implements Comparator<customer> {

    public int compare(customer s1, customer s2) {
        return s1.name.compareTo(s2.name);
    }
}


class customerNumber implements Comparator<customer>{

    public int compare(customer s1 , customer s2){
        return s1.accountNumber.compareTo(s2.accountNumber);
    }
}



public class Test91 {
    public static void main(String[] args){

        ArrayList<customer> store = new ArrayList<>();

        store.add(new customer("Allen","1234567890",100));
        store.add(new customer("Joan","2222222222",10));
        store.add(new customer("Harvey","3333333333",1000));
        store.add(new customer("Bala","4444444444",150));
        store.add(new customer("Dhanusha","5555555555",10000));

        System.out.println(store);

        boolean found1 = false;
        for(customer i : store){
            if(i.name.equals("Allen")){
                System.out.println("Founded: " +i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Account is not FOUND!");
        }

        boolean found2 = false;
        for(customer i : store){
            if(i.balance == 150){
                i.balance = 200;
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Account Number Not FOUND!");
        }


        boolean found3 = false;
        Iterator<customer> loop = store.iterator();

        while(loop.hasNext()){

            customer it = loop.next();

            if(it.name.equals("Joan")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Account Not Found");
        }

        Collections.sort(store, new customerName());
        System.out.println("Sorted by CustomerName: " + store);

        Collections.sort(store, new customerNumber());
        System.out.println("Sorted by customerNumber: " + store);


        System.out.println("Number of customer: "+ store.size());

        boolean found4 = false;
        for(customer i : store){
            if(i.name.equals("Dhanusha")){
                System.out.println("Sir account is Found");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Account is not Found");
        }


        store.set(3,new customer("SecretAgent","0000000007",0));
        System.out.println(store);


    }
}


import java.util.*;

class bankingcustomers {

    String name;
    double balance;
    int accountnumber;

    bankingcustomers(String name, double balance, int accountnumber) {
        this.name = name;
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    public String toString(){

        return "Customer Name :" + name  + "|Customer balance :" + balance + "|AccountName:" + accountnumber;

    }
}

class bankingcustomersystem{

    ArrayList<bankingcustomers> store = new ArrayList<>();

    void add(bankingcustomers s){
        store.add(s);
    }


    void search(String customername){

        boolean condition = false;

        for(bankingcustomers i : store){

            if(i.name.equals(customername)){
                System.out.println("\nCustomer is Found" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nCustomer Not Found");
        }
    }

    void update (String customername  , double balance){

        boolean condition = false;

        for(bankingcustomers i : store){
            if(i.name.equals(customername)){
                i.balance = balance;
                System.out.println("\nUpdated: " + i);
                condition = true;
                break;
            }
        }

        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void remove(double balance){

        boolean condition = false;
        Iterator<bankingcustomers> loop = store.iterator();

        while(loop.hasNext()){
            bankingcustomers search = loop.next();

            if(search.balance == balance){
                loop.remove();
                condition = true;
                System.out.println("\nSuccessfully Customer removed");
                break;
            }
        }
        if(!condition){
            System.out.println("\nCustomer is not found");
        }
    }

    void display(){

        System.out.println("\nCustomers Card List:");

        for(bankingcustomers i : store){

            System.out.println(i);

        }
    }

    void sortname() {

        Collections.sort(store, new Comparator<bankingcustomers>() {
            @Override
            public int compare(bankingcustomers s1, bankingcustomers s2) {
                return s1.name.compareTo((s2.name));
            }
        });

        System.out.println("\nSorted By name:" + store);

    }


    void sortbalance(){

        Collections.sort(store, new Comparator<bankingcustomers>() {
            @Override
            public int compare(bankingcustomers s1, bankingcustomers s2) {
                return Double.compare(s1.balance,s2.balance);
            }
        });

        System.out.println("\nSorted By Balance:" + store);

    }

    void countProduct(){

        System.out.println("\nThe Number of Customer:" + store.size());

    }

    void productExists(String name) {

        for (bankingcustomers s : store) {
            if (s.name.equals(name)) {
                System.out.println("\nCustomer Exists" + s);
                return;
            }
        }

        System.out.println("\nCustomer Does Not Exist");
    }
}


public class Test101{
    public static void main(String[] args){

        bankingcustomersystem s = new bankingcustomersystem();


        s.add(new bankingcustomers("Allen",1500.00,1023343));
        s.add(new bankingcustomers("Joan",500.00,2534343));
        s.add(new bankingcustomers("Harvey",50000.00,54334));
        s.add(new bankingcustomers("Harrish",10000.00,1043343));
        s.add(new bankingcustomers("Dhanusha",5500.00,154334));


        s.display();

        s.search("Joan");

        s.countProduct();

        s.update("Allen",6000.00);

        s.sortname();

        s.sortbalance();

        s.remove(1500.00);

        s.display();

        s.productExists("Dhanusha");



    }




}
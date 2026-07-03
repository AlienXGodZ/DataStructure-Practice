import java.util.*;

class patient {
    int patientid;
    String name;
    int age;
    String disease;


    patient(int patientid,String name, int age, String disease){
        this.patientid = patientid;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String toString(){
        return "PatientId: " + patientid + " | PatientName: " + name + " | PatientAge: " + age + "| PatientDisease: " + disease;
    }
}

class patientName implements Comparator<patient> {

    public int compare(patient s1, patient s2) {
        return s1.name.compareTo(s2.name);
    }
}


class patientId implements Comparator<patient>{

    public int compare(patient s1 , patient s2){
        return Integer.compare(s1.patientid,s2.patientid);
    }
}

class patientAge implements Comparator<patient> {

    public int compare(patient s1, patient s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class patientDisease implements Comparator<patient> {

    public int compare(patient s1, patient s2) {
        return s1.disease.compareTo(s2.disease);
    }
}

public class Test92 {
    public static void main(String[] args){

        ArrayList<patient> store = new ArrayList<>();

        store.add(new patient(101,"Allem",21,"Ulcer"));
        store.add(new patient(102,"Harvey",30,"Cancer"));
        store.add(new patient(103,"Joan",16,"StomachPain"));

        System.out.println(store);

        boolean found1 = false;
        for(patient i : store){
            if(i.name.equals("Harvey")){
                System.out.println("Founded: " +i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Patient is not FOUND!");
        }

        boolean found2 = false;
        for(patient i : store){
            if(i.age == 21){
                i.age = 20;
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Patient is Not FOUND!");
        }


        boolean found3 = false;
        Iterator<patient> loop = store.iterator();

        while(loop.hasNext()){

            patient it = loop.next();

            if(it.name.equals("Harvey")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Patient is Not Found");
        }

        Collections.sort(store, new patientName());
        System.out.println("Sorted by PatientName: " + store);

        Collections.sort(store, new patientId());
        System.out.println("Sorted by patientID: " + store);

        Collections.sort(store, new patientAge());
        System.out.println("Sorted by Patientage: " + store);

        Collections.sort(store, new patientDisease());
        System.out.println("Sorted by PatientDiesase: " + store);

        System.out.println("Number of Patient: "+ store.size());

        boolean found4 = false;
        for(patient i : store){
            if(i.name.equals("Joan")){
                System.out.println("Sir Patient is in the Found");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Patient is not in the Found");
        }


        store.set(1,new patient(102,"Stella",48,"Skin Alergy"));
        System.out.println(store);


    }
}


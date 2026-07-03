import java.util.*;

class course {
    int courseId;
    String coursName;
    String courseDuration;
    String courseTrainer;


    course(int courseId,String courseName, String courseDuration, String courseTrainer){
        this.courseId = courseId;
        this.coursName = courseName;
        this.courseDuration = courseDuration;
        this.courseTrainer = courseTrainer;
    }

    public String toString(){
        return "CourseId: " + courseId + " | CouseName: " + coursName + " | CourseDuration: " + courseDuration + "| CourseTrainer: " + courseTrainer;
    }
}

class name implements Comparator<course> {

    public int compare(course s1, course s2) {
        return s1.coursName.compareTo(s2.coursName);
    }
}


class id implements Comparator<course>{

    public int compare(course s1 , course s2){
        return Integer.compare(s1.courseId,s2.courseId);
    }
}

class duration implements Comparator<course> {

    public int compare(course s1, course s2) {
        return s1.courseDuration.compareTo(s2.courseDuration);
    }
}

class trainer implements Comparator<course> {

    public int compare(course s1, course s2) {
        return s1.courseTrainer.compareTo(s2.courseTrainer);
    }
}

public class Test93 {
    public static void main(String[] args){

        ArrayList<course> store = new ArrayList<>();

        store.add(new course(101,"Java","120 Days","Allen"));
        store.add(new course(102,"Python","80 Days","Joan"));
        store.add(new course(103,"JavaScript","150 Days","Harvey"));

        System.out.println(store);

        boolean found1 = false;
        for(course i : store){
            if(i.coursName.equals("Java")){
                System.out.println("Founded: " +i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Course is not FOUND!");
        }

        boolean found2 = false;
        for(course i : store){
            if(i.courseId == 102){
                i.courseId = 1102;
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("course is Not FOUND!");
        }


        boolean found3 = false;
        Iterator<course> loop = store.iterator();

        while(loop.hasNext()){

            course it = loop.next();

            if(it.courseTrainer.equals("Harvey")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Course is Not Found");
        }

        Collections.sort(store, new name());
        System.out.println("Sorted by CourseName: " + store);

        Collections.sort(store, new id());
        System.out.println("Sorted by CourseID: " + store);

        Collections.sort(store, new duration());
        System.out.println("Sorted by Duration: " + store);

        Collections.sort(store, new trainer());
        System.out.println("Sorted by trainer: " + store);

        System.out.println("Number of Course: "+ store.size());

        boolean found4 = false;
        for(course i : store){
            if(i.courseId == 101){
                System.out.println("Sir Trainer" + i.courseTrainer + "is in the Found");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Trainer is not in the Found");
        }


        store.set(1,new course(102,"SQL","40 Days","Robert"));
        System.out.println(store);


    }
}


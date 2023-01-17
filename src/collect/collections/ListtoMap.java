package collect.collections;
import java.util.*;
public class ListtoMap {
    public static void main(String[] args)
    {

        // create a list
        List<Student>
                lt = new ArrayList<Student>();

        // add the member of list
        lt.add(new Student(1, "Harish"));
        lt.add(new Student(2, "Abhi"));
        lt.add(new Student(3, "Harish"));

        //create the 2 list
       List<Student> lt1 = new ArrayList<Student>();

        // add the member of list
        lt1.add(new Student(1, "Shiva"));
        lt1.add(new Student(2, "Rahul"));
        lt1.add(new Student(3, "Shiva"));
        // create map with the help of
        // Object (stu) method
        // create object of Map class
        Map<Integer, String> map = new HashMap<>();

        // put every value list to Map
        for (Student stu : lt) {
            map.put(stu.getId(), stu.getName());
        }
        System.out.println("Map  : " + map);
        for (Student stu : lt1) {
            map.put(stu.getId(), stu.getName());
        }

        // print map

        System.out.println("Map  : " + map);
    }

}

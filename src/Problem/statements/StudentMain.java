package Problem.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admission ad = new Admission();
        System.out.println("Enter the number of students");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            System.out.println("Enter the RollNo:");
            st.setRollNo(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter the Name:");
            st.setName(sc.nextLine());
            System.out.println("Enter the course:");
            st.setCourse(sc.nextLine());
            System.out.println("Enter the marks:");
            st.setMarks(Integer.parseInt(sc.nextLine()));
            ad.addMarks(st);
        }
        ArrayList<Student> res = ad.viewAllStudents();
        Iterator itr = res.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println("RollNo: " + st.getRollNo());
            System.out.println("Name: " + st.getName());
            System.out.println("Course: " + st.getCourse());
            System.out.println("Marks: " + st.getMarks());
        }
        System.out.println("Enter the Max value");
        int n1=Integer.parseInt(sc.nextLine());
        for(int j=0;j<n;j++)
        {
            Student st1 = ad.removeStudent(n1);
            if (st1 != null) {
                System.out.println(st1.getRollNo() + " " + st1.getName() + " " + st1.getCourse() + " " + st1.getMarks());
            }
        }
        System.out.println("This are the students who got less than 70 marks");
    }
}


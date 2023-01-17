package Problem.statements;

import java.util.ArrayList;

public class Admission
{
    private ArrayList<Student> std=new ArrayList<Student>();
    public void addMarks(Student stu)
    {
        std.add(stu);
    }
    public ArrayList<Student> viewAllStudents()
    {
        return std;
    }
    public Student removeStudent(int sMarks)
    {
        for(int i=0;i<std.size();i++)
        {
            if(std.get(i).getMarks()<sMarks)
            {
                Student sObj=std.remove(i);
                return sObj;
            }
        }
        return null;
    }
}

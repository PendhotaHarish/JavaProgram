package collect.collections;

import java.util.TreeSet;

public class TreeSets
{
    public static void main(String[] args)
    {
        TreeSet t=new TreeSet();//default natural sorting order
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

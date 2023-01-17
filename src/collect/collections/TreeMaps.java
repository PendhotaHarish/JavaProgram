package collect.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMaps
{
    public static void main(String[] args)
    {
        TreeMap t=new TreeMap();//default natural sorting order
        t.put(10,"a");
        t.put(0,"b");
        t.put(15,"c");
        t.put(20,"d");
        t.put(20,"e");
        System.out.println(t);
    }
}

package collect.collections;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapComparartor
{
    public static void main(String[] args)
    {
        TreeMap t=new TreeMap(new MyComparartors());//customizing sorting order
        t.put(10,"a");
        t.put(0,"b");
        t.put(15,"c");
        t.put(20,"d");
        t.put(20,"e");
        System.out.println(t);
    }
}
class MyComparartors implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        /*if(i1<i2)
        {
            return+1;
        }
        else if(i1>i2)
        {
            return -1;
        }
        else
        {
            return 0;
        }*/
        return i2.compareTo(i1);
    }
}


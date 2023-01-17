package collect.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets
{
    public static void main(String[] args)
    {
        HashSet<String> set=new HashSet();
        set.add("car");
        set.add("bike");
        set.add("truck");
        set.add("airplane");
        set.add("car");
        Iterator<String> it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(set.contains("bike"));
        set.remove("truck");
        System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}

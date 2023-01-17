package collect.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets
{
    public static void main(String[] args)
    {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('e');
        set.add('c');
        Iterator<Character> it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

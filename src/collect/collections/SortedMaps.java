package collect.collections;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMaps
{
    public static void main(String[] args)
    {
        SortedMap numbers = new TreeMap();
        // Insert elements to the set
        numbers.put(1,"red");
        numbers.put(2,"blue");
        numbers.put(3,"black");
        numbers.put(4,"yellow");
        System.out.println(numbers);
        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.headMap(3));
        System.out.println(numbers.tailMap(2));
        System.out.println(numbers.subMap(2,4));
    }
}

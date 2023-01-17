package collect.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets
{
    public static void main(String[] args)
    {
        SortedSet<Integer> numbers = new TreeSet<>();
        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.headSet(3));
        System.out.println(numbers.tailSet(2));
        System.out.println(numbers.subSet(2,4));
    }
}

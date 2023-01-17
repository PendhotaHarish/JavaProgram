package collect.collections;

import java.util.LinkedList;

public class LinkedLists
{
    public static void main(String[] args)
    {
        LinkedList<Double> list=new LinkedList<>();
        list.add(2000.00);
        list.add(1000.00);
        list.add(3000.00);
        list.add(2000.00);
        list.add(4000.00);
        System.out.println("Employee salary details ");
        for(double sal:list)
        {
            System.out.println(sal);
        }
        // some linkedList methods
        list.addFirst(6000.00);
        list.addLast(5000.00);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.add(2,7000.00);
        System.out.println(list);
    }
}

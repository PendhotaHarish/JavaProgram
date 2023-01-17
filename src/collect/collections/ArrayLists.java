package collect.collections;

import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(10);
        for(int i:list)
        {
            System.out.println(i);
        }
        System.out.println("get method "+list.get(2));
        list.set(1,9);
        for(int i:list)
        {
            System.out.println(i);
        }
        System.out.println();
        list.remove(4);
        for(int i:list)
        {
            System.out.println(i);
        }
    }
}

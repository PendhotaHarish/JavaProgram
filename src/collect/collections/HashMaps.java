package collect.collections;

import java.util.*;

public class HashMaps
{
    public static void main(String[] args)
    {
        HashMap m=new HashMap();
        m.put("hari",132);
        m.put("raju",134);
        m.put("ramu",167);
        m.put("rock",205);
        System.out.println(m);
        System.out.println(m.put("raju",250));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator it=s1.iterator();
        while(it.hasNext())
        {
            Map.Entry m1=(Map.Entry)it.next();
            System.out.println(m1.getKey()+"--- "+m1.getValue());
            if(m1.getKey().equals("hari"))
            {
                m1.setValue(300);
            }
        }
        System.out.println(m);
    }
}

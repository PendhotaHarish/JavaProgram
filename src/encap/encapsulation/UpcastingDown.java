package encap.encapsulation;

public class UpcastingDown
{
    public static void main(String[] args)
    {
        //upcasting
        Parent p=new Child();
        p.name="harish";
        p.role="Tester";
        System.out.println(p.name);
        System.out.println(p.role);
        p.method();
        //DownCasting
        Child c=(Child)p;
        c.id=20;
        c.salary=25000;
        System.out.println(c.name);
        System.out.println(c.role);
        System.out.println(c.id);
        System.out.println(c.salary);
        c.method();
    }
}

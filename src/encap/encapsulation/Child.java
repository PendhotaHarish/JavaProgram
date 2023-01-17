package encap.encapsulation;

public class Child extends Parent
{
    int id;
    double salary;
    @Override
    public void method()
    {
        System.out.println("method from child");
    }
}

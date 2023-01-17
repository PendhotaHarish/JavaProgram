package inherite.inheritance;

public class Car extends Vehicles
{
    private String price;
    public Car(String make, String color, int year, String model, String price)
    {
        super(make, color, year, model);
        this.price=price;
    }
    public void carDetails()
    {
        printDetails();
        System.out.println("Price " +price);
    }
}
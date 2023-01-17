package inherite.inheritance;

public class Bike extends Vehicles
{
    private String price;
    private String speed;

    public Bike(String make, String color, int year, String model, String price, String speed)
    {
        super(make, color, year, model);
        this.price=price;
        this.speed=speed;
    }
    public void bikeDetails()
    {
        printDetails();
        System.out.println("Price "+price);
        System.out.println("Speed "+speed);
    }
}

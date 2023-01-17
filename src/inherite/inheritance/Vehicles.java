package inherite.inheritance;

public class Vehicles
{
    private String make;
    private String color;
    private int year;
    private String model;
    public Vehicles(String make, String color, int year, String model)
    {
        this.make=make;
        this.color=color;
        this.year=year;
        this.model=model;
    }
    public void printDetails()
    {
        System.out.println("Manufacture " +make);
        System.out.println("Color " +color);
        System.out.println("Year " +year);
        System.out.println("Model " +model);
    }
}

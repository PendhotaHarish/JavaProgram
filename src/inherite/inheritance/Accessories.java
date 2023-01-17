package inherite.inheritance;

public class Accessories extends Car
{
    private String speaker;
    private String light;
    private String seatCover;

    public Accessories(String make, String color, int year, String model, String price, String speaker,String light, String seatCover)
    {
        super(make, color, year, model, price);
        this.speaker=speaker;
        this.light=light;
        this.seatCover=seatCover;
    }
    public void accessoriesDetails()
    {
        carDetails();
        System.out.println("Speaker "+speaker);
        System.out.println("Light "+light);
        System.out.println("SeatCover "+seatCover);
    }
}

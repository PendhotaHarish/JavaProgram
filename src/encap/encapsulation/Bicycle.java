package encap.encapsulation;

public class Bicycle implements Vehicle
{

    int speed;
    int gear;
    int speedDecrease;
    @Override
    public void changeGear(int newGear)
    {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment)
    {
        speed=increment;
    }

    @Override
    public void applyBrakes(int decrement)
    {
        speedDecrease=speed-decrement;
    }
    public void printStates()
    {
        System.out.println("speed: " + speed
                + " gear: " + gear +" speedDecrease: "+ speedDecrease);
    }
}

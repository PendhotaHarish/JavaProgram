package abst.abstraction;

abstract class Shape
{
    private String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color)
    {
        System.out.println("shape constructor called ");
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
}

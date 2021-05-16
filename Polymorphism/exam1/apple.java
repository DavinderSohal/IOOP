package Polymorphism.exam1;

public class apple extends fruit{
    private double weight;

    public apple(String name, String color, double weight){
        super(name, color);
        this.weight = weight;
    }
    public void print()
    {
        System.out.println("Details of the apple:");
        super.print();
        System.out.println("Weight of the apple: " + weight);
    }
}

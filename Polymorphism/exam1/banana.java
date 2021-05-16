package Polymorphism.exam1;

public class banana extends fruit{
    private double length;

    public banana(String name, String color, double length){
        super(name, color);
        this.length = length;
    }
    public void print()
    {
        System.out.println("Details of the Banana:");
        super.print();
        System.out.println("Length of the Banana: " + length);
    }
}

package Polymorphism.exam1;

public class fruit{
    private String name,color;

    public fruit(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void print(){
        System.out.println("Name of the Fruit: "+name);
        System.out.println("Color of the Fruit: "+color);
    }
}

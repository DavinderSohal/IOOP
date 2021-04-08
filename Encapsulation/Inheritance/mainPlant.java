package Encapsulation.Inheritance;

public class mainPlant{
    public static void main(String[] args){
        Apple a = new Apple();
        Banana b = new Banana();

        a.grow(2);
        a.name("apple");

        b.grow(3);
        b.name("banana");
    }
}

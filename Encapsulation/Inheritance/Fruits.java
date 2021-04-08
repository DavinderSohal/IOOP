package Encapsulation.Inheritance;

public class Fruits{
    public void grow(int rate){
        System.out.println("I grow at rate of " + rate + " cm per day");
    }

    public void name(String name){
        System.out.println("My name is " + name);
    }
}

class Banana extends Fruits{
}

class Apple extends Fruits{
}

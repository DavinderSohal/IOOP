package Polymorphism.exam;

// created a super class customer
public class customer{

    // vaiable declaration
    private String name;
    private int id;

    //constructor of super class
    public customer(String name, int id){
        this.name = name;
        this.id = id;
    }

    // print function of super class to print details
    public void print(){
        System.out.println("Name of the customer: " + name);
        System.out.println("ID of the customer: " + id);
    }
}

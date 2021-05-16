package Polymorphism.exam;

// class customerReturn inherits customer
public class customerReturn extends customer{

    //declaring variables
    private String product;
    private double price;

    // constructor for customerReturn class
    public customerReturn(String name, int id, String product, double price){
        // calling constructor of super class
        super(name, id);
        this.product = product;
        this.price = price;
    }

    // created a function print for customerReturn class to show the details
    public void print(){
        System.out.println("\nReturner details:");
        super.print();
        System.out.println("Product: " + product);
        System.out.println("Price: $" + price);
    }
}

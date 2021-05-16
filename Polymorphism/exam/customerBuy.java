package Polymorphism.exam;

// class customerBuy inherits customer
public class customerBuy extends customer{
    //declaring variables
    private String product_name;

    // constructor for customerBuy class
    public customerBuy(String name, int id, String product_name){
        // calling constructor of super class
        super(name, id);
        this.product_name = product_name;
    }

    // created a function print to show the details
    public void print(){
        System.out.println("\nBuyer details:");
        super.print();
        System.out.println("Product name: " + product_name);
    }
}

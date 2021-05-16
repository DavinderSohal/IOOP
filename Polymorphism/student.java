package Polymorphism;

public class student extends person{
    private int grad_year;
    private double gpa;

    public student(String first_name, String last_name, int grad_year, double gpa){
        super(first_name, last_name);
        this.grad_year = grad_year;
        this.gpa = gpa;
    }
    public void print(){
        System.out.println("\nStudent details:");
        super.print();
        System.out.println(grad_year);
        System.out.println(gpa);
    }
}

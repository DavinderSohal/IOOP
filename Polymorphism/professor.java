package Polymorphism;

public class professor extends person{
    public professor(String first_name, String last_name){
        super(first_name, last_name);
    }

    public void print(){
        System.out.println("\nProfessor details:");
        super.print();
    }
}

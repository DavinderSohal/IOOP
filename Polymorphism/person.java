package Polymorphism;

public class person{
    private String first_name;
    private String last_name;

    public person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public void print(){
        System.out.println(first_name + " " + last_name);
    }
}

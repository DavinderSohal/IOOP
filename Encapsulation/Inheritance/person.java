package Encapsulation.Inheritance;

public class person{
    public void height(double height){
        System.out.println("Height: " + height);
    }

    public void weight(double weight){
        System.out.println("Weight: " + weight);
    }

    public void eye_colour(String eye_colour){
        System.out.println("Eye colour: " + eye_colour);
    }
}

class student extends person{
}

class Main{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.height(1111);
        s1.weight(5555);
        s1.eye_colour("Red");
        System.out.println();

        s2.height(222);
        s2.weight(444);
        s2.eye_colour("green");
        System.out.println();

        s3.height(888);
        s3.weight(777);
        s3.eye_colour("blue");
    }
}
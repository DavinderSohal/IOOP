package Polymorphism;

public class testPoly{
    public static void main(String[] args){
        person[] persons = new person[3];
        persons[0] = new student("Davinder", "Sohal", 2020, 5);
        persons[1] = new student("Sam", "Watson", 2020, 3);
        persons[2] = new professor("Zahra", "Hasan");

        for(person i: persons){
            i.print();
        }
    }
}

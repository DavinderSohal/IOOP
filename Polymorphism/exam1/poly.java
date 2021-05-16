package Polymorphism.exam1;

public class poly{
    public static void main(String[] args){
        fruit app = new apple("apple", "red", 5.5);
        fruit ban = new banana("banana", "yellow", 0.5);
        app.print();
        ban.print();
    }
}

package Encapsulation;

public class Main{
    public static void main(String[] args){
        User usr = new User();

        usr.setFirst_name("Davinder");
        usr.setLast_name("Sohal");

        System.out.println("\nIn uppercase: " + usr.getFirst_name().toUpperCase() + " " + usr.getLast_name().toUpperCase());
        System.out.println("In lowercase: " + usr.getFirst_name().toLowerCase() + " " + usr.getLast_name().toLowerCase());
    }
}

package Encapsulation;

public class Main{
    public static void main(String[] args){
        User usr1 = new User();
        User usr2 = new User();
        User usr3 = new User();

        usr1.setFirst_name("Davinder");
        usr1.setLast_name("Sohal");
        usr1.setId(555555);
        usr1.checkPassword();

        usr2.setFirst_name("dddd");
        usr2.setLast_name("ssss");
        usr2.setId(444455);
        usr2.checkPassword();

        usr3.setFirst_name("davinder");
        usr3.setLast_name("singh");
        usr3.setId(1234);
        usr3.checkPassword();

        System.out.println("\nIn uppercase: " + usr1.getFirst_name()+ " " + usr1.getLast_name() + "\nID: " + usr1.getId());
//        System.out.println("In lowercase: " + usr1.getFirst_name().toLowerCase() + " " + usr1.getLast_name().toLowerCase());
        System.out.println("First name: " + usr2.getFirst_name() + "\nLast name: " + usr2.getLast_name() + "\nID: " + usr2.getId());
    }
}

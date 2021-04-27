package Encapsulation.Activity;

public class Main{
    public static void main(String[] args){

        students std = new students("Davinder", "Sohal", "davinderSohal", 5, "IT");
        teacher thr = new teacher("Mr. Davinder", "Singh", "password", "12-12-12", 12345);

        System.out.println("\nFirst name: " + std.getFirst_name());
        System.out.println("Last name: " + std.getLast_name());
        System.out.println("Password: " + std.getPassword());
        System.out.println("GPA: " + std.getGPA());
        System.out.println("Specialization: " + std.getSpecialization());
        System.out.println("\n--------------------------\n");
        System.out.println("First name: " + thr.getFirst_name());
        System.out.println("Last name: " + thr.getLast_name());
        System.out.println("Password: " + thr.getPassword());
        System.out.println("Date of hiring: " + thr.getDate_of_hiring());
        System.out.println("Teacher id: " + thr.getId_number());
    }
}

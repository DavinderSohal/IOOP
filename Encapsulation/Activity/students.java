package Encapsulation.Activity;


public class students extends person{
    double GPA;
    String specialization;

    public students(String first_name, String last_name, String password, double GPA, String specialization){
        super(first_name, last_name, password);
        this.GPA = GPA;
        this.specialization = specialization;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}

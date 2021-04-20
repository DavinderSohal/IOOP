package Encapsulation.Activity;


public class students extends person{
    int GPA;

    public students(String first_name, String last_name, String password, int GPA){
        super(first_name, last_name, password);
        this.GPA = GPA;
    }

    public int getGPA(){
        return GPA;
    }

    public void setGPA(int GPA){
        this.GPA = GPA;
    }
}

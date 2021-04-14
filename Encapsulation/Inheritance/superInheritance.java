package Encapsulation.Inheritance;

public class superInheritance{
    String name, address, nationality;
    double age;

    public superInheritance(String n, double a, String ad, String nation){
        name = n;
        age = a;
        address = ad;
        nationality = nation;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public double getAge(){
        return age;
    }

    public void setAge(double age){
        this.age = age;
    }
}

class students extends superInheritance{
    int study_level;
    String specialization;
    double GPA;

    public students(String n, double a, String ad, String nation, int study_level, String specialization, double GPA){
        super(n, a, ad, nation);
        this.study_level = study_level;
        this.specialization = specialization;
        this.GPA = GPA;
    }

    public int getStudy_level(){
        return study_level;
    }

    public void setStudy_level(int study_level){
        this.study_level = study_level;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

}

class superMain{
    public static void main(String[] args){
        students std = new students("Davinder Singh", 24, "Patiala, Punjab", "Indian", 1, "IT", 8);

        System.out.println("Name:               " + std.getName());
        System.out.println("Age:                " + std.getAge());
        System.out.println("Address :           " + std.getAddress());
        System.out.println("Nationality:        " + std.getNationality());
        System.out.println("Study level:        " + std.getStudy_level());
        System.out.println("Specialization:     " + std.getSpecialization());
        System.out.println("GPA:                " + std.getGPA());
    }
}

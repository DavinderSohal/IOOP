package Encapsulation.Activity;


public class teacher extends person{

    String date_of_hiring;
    int id_number;

    public teacher(String first_name, String last_name, String password, String date_of_hiring, int id_number){
        super(first_name, last_name, password);
        this.date_of_hiring = date_of_hiring;
        this.id_number = id_number;
    }

    public String getDate_of_hiring(){
        return date_of_hiring;
    }

    public void setDate_of_hiring(String date_of_hiring){
        this.date_of_hiring = date_of_hiring;
    }

    public int getId_number(){
        return id_number;
    }

    public void setId_number(int id_number){
        this.id_number = id_number;
    }
}


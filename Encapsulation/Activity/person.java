package Encapsulation.Activity;


public class person{
    String first_name, last_name, password;

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public person(String first_name, String last_name, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
    }
}

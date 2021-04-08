package Encapsulation;

public class User{
    private String first_name;
    private String last_name;
    private Integer id;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
//        if(id > 2000){
            this.id = id;
//        }
    }

    public String getFirst_name(){
//        return first_name;
        return first_name.toUpperCase();
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
//        return last_name;
        return last_name.toUpperCase();
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public void checkPassword(){
        int password = 1234;
        if(id == password){
            System.out.printf("\n%s %s, System is open\n", first_name, last_name);
        }else{
            System.out.printf("\n%s %s, System is closed\n", first_name, last_name);
        }

    }
}

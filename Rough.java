public class Rough {
    public String name;
    public int id;

    public Rough(String name,int id) {
        this.name=name;
        this.id=id;
    }

    public void print() {


    }

}

 class Buy extends Rough {
    public String BuyerName;
    public String Productname;

    public Buy(String name, int id,String BuyerName,String Productname) {

        super(name, id);
        this.BuyerName=BuyerName;
        this.Productname=Productname;


    }
    public void print() {
        System.out.println();
        super.print();
        System.out.println(BuyerName);
        System.out.println(Productname);
    }

}

 class Return extends Rough {
    public String returndetails;
    public String Productname;
    public float price;


    public Return(String name, int id,String returndetails,String Productname,float price) {
        super(name, id);
        this.returndetails=returndetails;
        this.Productname=Productname;
        this.price=price;


    }
    public void print() {
        System.out.println();
        super.print();
        System.out.println(returndetails);
        System.out.println(Productname);
        System.out.println(price);
    }

}

 class Main {

    public static void main(String[] args) {
        Buy buy=new Buy("joseph",12345,"malik","car");
        Return ret=new Return("joseph",34567,"david","tyres",5000);

        buy.print();
        ret.print();

    }

}
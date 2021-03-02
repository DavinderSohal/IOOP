//making simple calculator with fixed values.

public class SimpleCalculator{
    public static void main(String[] args){
        // using final keyword so that it's value can't be reinitialized (changed)
        final int x = 10;
        final int y = 5;

        int z = x + y;
        int w = x - y;

        System.out.println("The summation is: " + z);
        System.out.println("The difference is: " + w);
    }
}

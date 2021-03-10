/*
 *       START
 * Step 1: Declare the variable hours, minutes, seconds and i
 * Step 2: Make an infinite loop
 * Step 3: Declare second = value of i
 * Step 4: if second is exactly equals to 60
 * Step 5: then second = 0, minute will be incremented by 1
 * Step 6: if minutes is exactly equals to 60
 * Step 7: then minute = 0, hour will be incremented by 1
 * Step 8: if hour is exactly equals to 24
 * Step 9: then hour=0,minute = 0 and seconds=0
 * Step 10: break for loop
 * Step 11: display hours, minutes and seconds
 *       END
 * */

public class DigitalClock{
    public static void main(String[] args){
        int hour = 0, min = 0, sec, i = 0;
        for(; ; ){
            sec = i;
            if(sec == 60){
                sec = 0;
                min += 1;
                if(min == 60){
                    min = 0;
                    hour += 1;
                    if(hour == 24){
                        hour = 0;
                        System.out.printf("hours, minutes and seconds ==> %02d : %02d : %02d\n", hour, min, sec);
                        break;
                    }
                }
                i = 0;
            }else{
                i++;
            }
            System.out.printf("hours, minutes and seconds ==> %02d : %02d : %02d\n", hour, min, sec);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class DigitalClock2{
    public static void main(String[] args){
        for(int hour = 0; hour < 24; hour++){
            for(int min = 0; min < 60; min++){
                for(int sec = 0; sec < 60; sec++){
                    System.out.printf("Hours: Minutes: Seconds :: %02d:%02d:%02d\n", hour, min, sec);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                    }
                }
            }
        }
    }
}

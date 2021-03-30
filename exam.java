import java.util.Scanner;

public class exam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // asking current time from user
        System.out.println("Enter current time (HH:MM:SS)");
        System.out.print("Hours: ");
        // asking current hours
        int current_hour = sc.nextInt();
        System.out.print("Minutes: ");
        // asking current minutes
        int current_minutes = sc.nextInt();
        System.out.print("Seconds: ");
        // asking current seconds
        int current_seconds = sc.nextInt();

        int count = 0;

        // 1st loop will print the hours starting from current time
        for(int hour = current_hour; hour < 24; hour++){
            // 2nd loop will print the minutes starting from current time
            for(int min = current_minutes; min < 60; min++){
                // 3rd loop will print the seconds starting from current time
                for(int sec = current_seconds; sec < 60; sec++){

                    // displaying the final result
                    System.out.printf("Hours: Minutes: Seconds :: %02d:%02d:%02d\n", hour, min, sec);
                    // try and catch to use sleep method to slow down the process by 1 sec.
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }

                    // after time reach midnight it assign value zero to all
                    if(hour == 23 && min == 59 && sec == 59 && count == 0){
                        hour = min = sec = 0;
                        count++;
                    }
                }
            }
        }
    }
}

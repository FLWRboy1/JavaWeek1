//frank mullahy
//3/5/25

import java.util.*;

public class timeConversion {
 
    public static void main(String[]args)
    {

        int time;
        int mins;
        int time2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time in minutes: ");
        mins = input.nextInt();

        time = (mins/60);
        time2 = (mins%60);

        System.out.println("The time is " + time + ":" + time2);
    }
}

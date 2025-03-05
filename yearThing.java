//frank mullahy
//3/5/25

import java.util.*;

public class yearThing {
 
    public static void main(String[]args)
    {

        int yearB;
        int monthB;
        int dayB;
        int yearC;
        int monthC;
        int dayC;
        int sleep;
        int alive;
        int yidB;
        int midB;
        int yidC;
        int midC;
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday");

        System.out.println("Year:");
        yearB = input.nextInt();
        System.out.println("Month:");
        monthB = input.nextInt();
        System.out.println("Day:");
        dayB = input.nextInt();
    
        System.out.println("Enter the date");

        System.out.println("Year:");
        yearC = input.nextInt();
        System.out.println("Month:");
        monthC = input.nextInt();
        System.out.println("Day:");
        dayC = input.nextInt();

        yidB = (yearB*365);
        midB = (monthB*31);
        
        yidC = (yearC*365);
        midC = (monthC*31);

        alive = (yidC + midC + dayC)-(yidB + midB + dayB);

        sleep = ((alive*24) / 2);

        System.out.println("You have been alive for: " + alive + "days");

        System.out.println("You have been asleep for: " + sleep + "hours");

    }
}
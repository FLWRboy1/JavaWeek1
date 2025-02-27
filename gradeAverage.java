//Frank Mullahy
//2/27/25
//gradeAverage

import java.util.*;

public class gradeAverage{
    
    public static void main (String[]args)
    {
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int avg;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        grade1 = input.nextInt();

        System.out.println("Enter a grade: ");
        grade2 = input.nextInt();

        System.out.println("Enter a grade: ");
        grade3 = input.nextInt();

        System.out.println("Enter a grade: ");
        grade4 = input.nextInt();

        avg = ((grade1 + grade2 + grade3 + grade4)/4);

        System.out.println("Your average grade is: " + avg);
    }
}

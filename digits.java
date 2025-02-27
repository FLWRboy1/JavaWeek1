//frank mullahy
//2/25/25
//digits.java
//isolates digits

import java.util.*;

public class digits {

    public static void main (String[]args)
    {

        int number;
        int ones;
        int tens;
        int hundreds;
        int thousands;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");

        number = input.nextInt();

        ones = number % 10;

        tens = (number/ 10) % 10;

        hundreds = ((number/10)/10) % 10;

        thousands = (((number/10)/10)/10) % 10;

        System.out.println("The original number is " + number + " the ones digit is " + ones + " the tens place is " + tens + " the hundreds place is " + hundreds + " and the thousands place is " + thousands);
    }
    
}

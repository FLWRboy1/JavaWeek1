//frank mullahy
//2/25/25
//digits.java
//isolates digits

public class digits {

    public static void main (String[]args)
    {

        int number;
        int ones;
        int tens;
        int hundreds;
        int thousands;

        number = 4258;

        ones = number % 10;

        tens = (number/ 10) % 10;

        hundreds = ((number/10)/10) % 10;

        thousands = (((number/10)/10)/10) % 10;

        System.out.println("The original number is" + number + " the ones digit is " + ones + " the tens place is " + tens + " the hundreds place is " + hundreds + " and the thousands place is " + thousands);
    }
    
}

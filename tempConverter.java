//frank mullahy
//3/3/25

import java.util.*;

public class tempConverter {
    
    public static void main(String[]args)
    {
    
        int Far;
        int Cel;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in farenhight: ");
        Far = input.nextInt();

        Cel = ((Far-32)*5/9);

        System.out.println("The degrees in celcius is " + Cel);

    }

}

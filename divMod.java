//frank mullahy
//3/4/24 my birfday!!!

import java.util.*;

public class divMod {

    public static void main(String[]args)
    {

        int first;
        int second;
        int fd;
        int fmd;
        int sd;
        int smd;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        first = input.nextInt();

        System.out.println("Enter the second number: ");
        second = input.nextInt();

        fd = (first / second);
        fmd = (first % second);
        sd = (second / first);
        smd = (second % first);

        System.out.println(first + "/" + second + "=" + fd);
        System.out.println(first + "%" + second + "=" + fmd);
        System.out.println(second + "/" + first + "=" + sd);
        System.out.println(second + "%" + first + "=" + smd);

    }

}

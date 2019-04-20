package JavaDemoTest;

import java.util.Scanner;

public class Reverse_Number_9
{
    //java main method
    public static void main(String []  args)
    {
        int num;
        int remainder;
        int result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        num=scanner.nextInt();

        while (num>0)
        {
            remainder=num%10;
            result=result * 10 + remainder;
            num=num/10;
        }
        System.out.println("Reverse of the Number is : "+result);
    }
}

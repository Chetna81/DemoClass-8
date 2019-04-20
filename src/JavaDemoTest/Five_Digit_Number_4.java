package JavaDemoTest;

import java.util.Scanner;

public class Five_Digit_Number_4
  {
      //java main method
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any five digit number");
        int n = scanner.nextInt();
        //int five digits number
        int a = 0;
        //given to digit number while loop
        while (n!=0)
        {
         int b=n%10;
         a=a+b;
         n=n/10;
        }
        System.out.println(a);
    }



}

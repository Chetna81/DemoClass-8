package JavaDemoTest;

import java.util.Scanner;

public class Prime_Number_2 {
    //java main method
    public static void main(String [] args)
    {
        int num, i,count=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number:");

        num =scanner.nextInt();
        //input number prime or not prime number
        for (i=2; i<num; i++)
        {
            if (num%i ==0)
            {
                count++;
                break;
            }
        }if (count == 0)
        {
            System.out.println("This is a Prime Number");
        }
        else
    {
        System.out.println("This is a not Prime Number");
    }
       }
       }

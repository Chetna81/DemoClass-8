package JavaDemoTest;

import java.util.Scanner;

public class Multiplication_tables_for_loop_11
{
    //java main method
    public static void main(String [] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=scanner.nextInt();
        //given number to multiplication tables for loop
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }

}

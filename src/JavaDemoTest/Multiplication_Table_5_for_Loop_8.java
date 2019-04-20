package JavaDemoTest;

import java.util.Scanner;

public class Multiplication_Table_5_for_Loop_8
           {
           //java main method
           public static void main(String [] args )
           {

           Scanner scanner = new Scanner(System.in);

           int no;

           System.out.println("Please enter the number :");

           no = scanner.nextInt();
           //given to multiplication table 5 for loop

           for ( int i = 0 ; i < 10 ; i++)
           {
               System.out.println(no + " * " + (i + 1) + " = " +(no *(i + 1)));
           }





       }
}

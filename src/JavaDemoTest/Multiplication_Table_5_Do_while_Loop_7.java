package JavaDemoTest;

import java.util.Scanner;

public class Multiplication_Table_5_Do_while_Loop_7
  {
      //java main method
      public static void main(String [] args)
      {
          int no, i = 0;
          int table[] = new int[10];
          Scanner scanner = new Scanner(System.in);

          System.out.println("Please enter the number");

          no = scanner.nextInt();
          //given to multiplication table 5 do while loop
          do
          {
            table[i]=no * (i+1);
            System.out.println(no + " * " + (i+1) + " = " + table[i]);
            i++;
          }while (i < 10);

          }
          }

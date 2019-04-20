package JavaDemoTest;

import java.util.Scanner;

public class Fibonacci_Series_6
  {
         //java main method
          public static void main(String [] args )
          {
          int num;
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter num:");
          num = scanner.nextInt();

          // int number fibonacci series
          int f1, f2=0, f3=1,f5=2,f8=3,f13=4,f24=1;
          for(int i=1; i<=num; i++)
          {
              System.out.println(f24+"");
              f1=f2;
              f2=f3;
              f3=f5;
              f5=f8;
              f8=f13;
              f13=f24;
              f24=f1 + f2 + f3 + f5 + f8 + f13;
          }
          }
          }

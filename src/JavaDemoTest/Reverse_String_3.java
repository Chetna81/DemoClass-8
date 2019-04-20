package JavaDemoTest;

import java.util.Scanner;

public class Reverse_String_3
  {
      //program called reverse string,and prints the reverse of the string
      //java main method
      public static void main(String [] args )
      {
        String org, rev="";
          Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to Reverse");
        org=scanner.nextLine();
        //input length value
        int length=org.length();

        for (int i=length - 1; i >=0; i--)
            rev=rev +org.charAt(i);

        System.out.println("Reverse of the entered string is:" +rev);
      }

  }

package JavaDemoTest;

import java.util.Scanner;

public class Positive_Negative_Zero_10 {
    //java main method
    public static void main(String[] args) {

        int countp = 0, countn = 0, countz = 0, i;
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Numbers :");
        for (i=0; i<10; i++);
        {
            arr[i] = scanner.nextInt();
        }
        //given to for loop positive, negative, and zero
        for (i=0; i<10; i++)
        {
            if (arr[i] < 0) {
                countn++;
            } else if (arr[i] == 0) {
                countz++;
            } else {
                countp++;
            }
        }
        System.out.println(countp + "Positive Number");
        System.out.println("\n" + countn + "Negative Number");
        System.out.println("\n" + countz + "Zero");
    }

}

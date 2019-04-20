package JavaDemoTest;



public class Armstrong_Number_1 {
    //program to check whether is armstrong number or not
    //java main method
    public static void main(String[] args) {
        //number check to check whether its armstrong number or not
        int x = 157;

        int y = 0;
        //variable to create 7
        int z;
        //create new variable for x
        int temp = x;
        while (x > 0)
        {
            //get value of 7
            z = x % 10;
            //excluded 7, now 15 left
            x = x / 10;
            //z value of 7
            y = y + z * z* z; //z value of 7
        }
        if(temp==y)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is not an Armstrong Number");
        }

        }
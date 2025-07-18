package InputOutputs;

import  java.util.*;
public class InputOutput {
    public static void main(String [] args){
        // Scanner is a pre-defined class.
        // System is a pre-defined class.
        // in and out is a static member of System class.

        Scanner sc = new Scanner(System.in); //input get from user
        System.out.println("Enter the first number :");//output print on the console
        int first = sc.nextInt();
        System.out.println("Enter the second number : ");
        int second = sc.nextInt();
        int sum = first + second;
        System.out.println("Sum of two number is :"+ sum);
        sc.close(); // when we make a Scanner class's object, then end of the code we used to close the object of scanner class.
    }
}

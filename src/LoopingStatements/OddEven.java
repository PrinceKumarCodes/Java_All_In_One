package LoopingStatements;

import java.util.Scanner;

public class OddEven {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number....");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Enter number is even number.");
        }else {
            System.out.println("Enter number is odd number.");
        }
    }
}

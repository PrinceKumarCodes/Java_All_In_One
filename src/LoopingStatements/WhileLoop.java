package LoopingStatements;
import java.util.Scanner;
//-----------------While loop Examples--------------
public class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for addition..");
        n = sc.nextInt();
        while(n>=0){
            System.out.println("Hello prince kumar singh...");
            n--;
        }
        sc.close();
    }
}

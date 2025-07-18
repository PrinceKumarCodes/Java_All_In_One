package LoopingStatements;
import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number..");
        int nth = sc.nextInt();
        for(int i = 0; i< nth; i++){
            for(int j = 0; j < nth; j++){
                System.out.print( " * ");
            }
            System.out.println();
        }

    }
}

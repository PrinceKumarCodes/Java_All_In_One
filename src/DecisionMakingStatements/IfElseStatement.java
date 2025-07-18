package DecisionMakingStatements;

import java.util.Scanner;

//---------------if else statement----------
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("+ve number..");
        }
        else{
            System.out.println("-ve number..");
        }
        sc.close();
    }

}

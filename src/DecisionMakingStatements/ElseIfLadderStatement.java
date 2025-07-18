package DecisionMakingStatements;

import java.util.Scanner;

//-----------Else if ladder statement-------------
public class ElseIfLadderStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks :");
        int marks = sc.nextInt();
        if(marks>=80){
            System.out.println("Topper..");
        }else if(marks>=60){
            System.out.println("First..");
        }else if(marks>=45){
            System.out.println("Second..");
        }else{
            System.out.println("Fail");
        }
    }
}

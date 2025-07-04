// -------------Simple If statement------------
import  java.util.*;
public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age :");
        int age = sc.nextInt();
        if(age >=18){ //This condition will always return boolean value.
            System.out.println("You are eligible to vote....");
        }
        System.out.println("Thank you");
    }
}

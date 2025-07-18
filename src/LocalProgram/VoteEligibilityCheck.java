package LocalProgram;
import java.util.*;
public class VoteEligibilityCheck {
    public static void main(String []args){
        System.out.print("Enter the age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Yes, You are Eligible to give vote!");
        }else{
            System.out.println("NO, You are not Eligible to give vote!");
        }
        sc.close();
    }
}

package LocalProgram;
import java.util.*;
public class CheckMaximumNumber {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number....");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        if(firstNum > secondNum){
            System.out.println("Maximum number is :"+ firstNum);
        }else{
            System.out.println("Maximum number is :"+ secondNum);
        }
        sc.nextInt();
    }
}

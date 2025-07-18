package LocalProgram;
import java.util.*;
public class MaximumThreeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number...");
        int first = sc.nextInt();
        System.out.println("Enter the second number...");
        int second = sc.nextInt();
        System.out.println("Enter the third number...");
        int third = sc.nextInt();
        if(first > second){
            if(first > third){
                System.out.println("Maximum number is :"+ first);
            }else{
                System.out.println("Maximum number is :"+ third);
            }
        }else{
            if(second > third){
                System.out.println("Maximum number is :"+ second);
            }else{
                System.out.println("Maximum number is :"+ third);
            }
        }
        sc.close();
    }

}

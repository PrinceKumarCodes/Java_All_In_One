package LocalProgram;
import java.util.*;
public class FindFactorial {
    public static void main(String []args){
        int n;
        int fact = 1;
        System.out.print("Enter a number to calculate factorial :");
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
//        for(int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+ n + " is " + fact);
        src.close();

    }
}

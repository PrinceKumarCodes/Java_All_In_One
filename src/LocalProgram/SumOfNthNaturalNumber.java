package LocalProgram;
import java.util.Scanner;

public class SumOfNthNaturalNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum =  sum + i;
        }
        System.out.println("Sum of nth natural number is :"+ sum);

        sc.close();
    }
}

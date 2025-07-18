package LocalProgram;
import java.util.Scanner;
public class CalculateOddNumber {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                evenSum = evenSum + i;
            }else{
                oddSum = oddSum + i;
            }
        }
        System.out.println("Calculate sum of even number between 1 to nth is :" + evenSum);
        System.out.println("Calculate sum of odd number between 1 to nth is :" + oddSum);
        sc.close();

    }
}

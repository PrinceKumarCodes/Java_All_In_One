package LocalProgram;
import java.util.*;
public class CalculatePower {
    public static void main(String[] args) {
        int n, p, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :" );
        n = sc.nextInt();
        System.out.println("Enter the power :");
        p = sc.nextInt();
        for(int i = 1; i <= p; i++){
            result = n * result;
        }
        System.out.println(p + " power of "+ n + " is  :" + result);
        sc.close();
    }
}

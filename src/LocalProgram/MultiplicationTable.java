package LocalProgram;
import java.util.*;
public class MultiplicationTable {
    public static void main(String []args){
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * "+ n + " = "+ (i*n));
        }
        sc.close();
    }
}

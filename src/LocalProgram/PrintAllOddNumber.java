package LocalProgram;
import java.util.Scanner;

public class PrintAllOddNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number...");
        int n = sc.nextInt();
        System.out.println("Print all odd number between 1 to nth 👇");
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }else{
                System.out.println(i + " ");
            }
        }
    }
}

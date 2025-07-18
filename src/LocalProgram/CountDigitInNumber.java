package LocalProgram;
import java.util.*;
public class CountDigitInNumber {
    public static void main(String []args){
        int n,rem, count = 0;
        System.out.println("Enter a large number :");
        Scanner   r = new Scanner(System.in);
        n = r.nextInt();
//        while(n>=1){
//            n = n/10;
//            count++;
//        }
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Total digit of given number is :"+ count);
        r.close();
    }
}

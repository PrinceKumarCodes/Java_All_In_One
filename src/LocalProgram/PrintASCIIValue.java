package LocalProgram;
import java.util.Scanner;
public class PrintASCIIValue {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter character... ");
        ch  = sc.next().charAt(0);
        int n = ch; //Implicit Typecasting character ke ASCII Value me convert karke integer me store kar dega
        System.out.println("ASCII value of "+ ch + " is "+ n);
        sc.close();
    }

}

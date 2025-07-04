//---------------------Switch statement----------
import java.util.*;
public class SwitchStatement {
    public static void main(String []args){
        int a = 20, b = 10, ch;
        System.out.println("Enter a choice ..");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Addition of two number :"+ (a + b));
                break;
            case 2:
                System.out.println("Abstraction of two number :"+ (a - b));
                break;
            case 3:
                System.out.println("Multiplication of two number :" + (a * b));
                break;
            case 4:
                System.out.println("Division of two number : "+ (a / b));
                break;
            case 5:
                System.out.println("Modules of two number : "+ (a % b));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}

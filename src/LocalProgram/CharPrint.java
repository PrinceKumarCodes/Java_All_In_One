package LocalProgram;

import java.util.Scanner;

public class CharPrint {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the character...");
        char ch = sc.next().charAt(0);
        System.out.println("Character is : "+ ch);
        sc.close();
    }
}

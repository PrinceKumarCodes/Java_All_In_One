import java.util.Scanner;
public class PrintName {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name :");
        String fullName = sc.nextLine();
        System.out.println("Your name is :"+ fullName);
        sc.close();
    }
}

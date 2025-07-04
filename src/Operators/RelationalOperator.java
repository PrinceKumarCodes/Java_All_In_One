 //-----------------Relational Operator Examples--------------
 import java.util.*;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int first  = sc.nextInt();
        System.out.print("Enter the second number :");
        int second = sc.nextInt();

        System.out.println( first+">"+second + " = "+ (first>second));
        System.out.println( first+"<"+second + " = "+ (first<second));
        System.out.println( first+">="+second + " = "+ (first>=second));
        System.out.println( first+"<="+second + " = "+ (first<=second));
        System.out.println( first+"=="+second + " = "+ (first==second));
        System.out.println( first+"!="+second + " = "+ (first!=second));

        sc.close();





    }
}

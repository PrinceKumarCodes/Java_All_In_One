//----------------------Area of Square----------------
// Area  = side * side
package LocalProgram;
import  java.util.Scanner;
public class FindAreaOfSquare {
    public static void main(String[] args) {
        int side, area;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        side = sc.nextInt();

        area = side * side;
        System.out.println("Area of square is :"+ area);
        sc.close();
    }
}

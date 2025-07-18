//--------------------Area of rectangle program-------------
// input length
// input breath
// Area of Rectangle  = length * breath

package LocalProgram;
import java.util.Scanner;
public class FindAreaOfRectangle {
    public static void main(String[] args) {
        // Declaration of variable
        int l, b, area;

        //Create object of Scanner class to take input.
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.println("Enter value for length ");
        l = sc.nextInt();
        System.out.println("Enter value for breath");
        b = sc.nextInt();

        //Calculate area of rectangle
        area = l * b;
        System.out.println("Area of Rectangle : "+ area );

        //close scanner class's object
        sc.close();

    }
}

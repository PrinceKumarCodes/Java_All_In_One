//--------------------Area of circle---------------
// Area of circle = PI * r * r
//PI  = 22/7 or 3.14

package LocalProgram;
import org.w3c.dom.ls.LSOutput;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;
public class FindAreaOfCircle {
    public static void main(String[] args) {
        //Declare variable
        double radius, Area;
        final double PI = 3.14;

        //create scanner class's object to take input from user
        Scanner sc = new Scanner(System.in);
        //Enter radius from user
        System.out.println("Enter radius of circle");
        radius = sc.nextInt();

        //Calculate area of circle
        Area = PI * radius * radius;

        System.out.println("Area of circle is : "+ Area);

        sc.close();
    }
}

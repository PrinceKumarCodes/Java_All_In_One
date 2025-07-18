//----------------Area of Triangle----------------
//input base
//input height
//Area = (1/2) * base * height

package LocalProgram;
import  java.util.Scanner;
public class FindAreaOFTriangle {
    public static void main(String[] args) {
        double base, height, Area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base for Triangle");
        base = sc.nextInt();
        System.out.println("Enter height for Triangle");
        height = sc.nextInt();

        Area = (base * height)/2;
        System.out.println("Area of Triangle is : "+ Area);
        sc.close();

    }
}

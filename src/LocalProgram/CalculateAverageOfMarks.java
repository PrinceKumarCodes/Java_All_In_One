package LocalProgram;
import java.util.*;
public class CalculateAverageOfMarks {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects.");
        System.out.print("Enter the mark of math :");
        int math = sc.nextInt();
        System.out.println("Enter the mark of phy :");
        int phy = sc.nextInt();
        System.out.println("Enter the mark of chem :");
        int chem = sc.nextInt();
        System.out.println("Enter the mark of science :");
        int science = sc.nextInt();
        System.out.println("Enter the mark of social science :");
        int socialScience = sc.nextInt();
        int avg = (math + phy + chem + science + socialScience)/5;
        System.out.print("Average marks of given five subjects :"+ avg);
        sc.close();



    }
}

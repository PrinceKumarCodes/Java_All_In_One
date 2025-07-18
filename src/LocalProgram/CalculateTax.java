 // ------------Tax calculation Program-----------
 //input sal<=10000------------------------------->No tax
 //input sal>10000 b/w sal<=100000---------------->10%
 //input sal > 100000----------------------------->20%

package LocalProgram;
import java.util.*;
public class CalculateTax {
    public static void main(String []args){
        //Declare variable
        int salary;
        double tax;
        //Create Scanner class for input.
        Scanner sc = new Scanner(System.in);

        //Enter salary for calculate tax.
        System.out.print("Enter salary :");
        salary = sc.nextInt();

        //check condition
        if(salary <=10000){
            System.out.println(" No Tax ");
        }else if(salary<=100000){
            tax = salary * 0.10;
            System.out.println(salary + " "+ tax);
        }else{
            tax = salary * 0.20;
            System.out.println(salary + " "+ tax);
        }

        //close scanner class's objects
        sc.close();
    }
}

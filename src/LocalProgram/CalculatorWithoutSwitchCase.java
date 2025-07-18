//-----------------Make calculator using java-----------------
//input n1, n2 -----------(input operator) result.
package LocalProgram;
import java.net.StandardSocketOptions;
import  java.util.Scanner;
public class CalculatorWithoutSwitchCase {
    public static void main(String []args){
        //Declare variable
        int n1,n2,choice;

        //Create Scanner class's Object to take input from user!
        Scanner sc = new Scanner(System.in);

        //take input from user.
        System.out.println("Enter first number : ");
        n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        n2 = sc.nextInt();
        System.out.println("Enter Operator!-----\nPress 1 for addition \n Press 2 for subtraction \n Press 3 for multiplication \n Press 4 for Division \n Press 5 for modulas ");
        choice = sc.nextInt();

        //Operation perform basis of condition
        if(choice==1){
            int result = n1 + n2;
            System.out.println("Sum of two number is : "+ result);
            return;
        }else if(choice == 2){
            int result = n1 + n2;
            System.out.println("Subtraction of two number  is : "+ result);
            return;
        }else if(choice==3){
            int result = n1 + n2;
            System.out.println("Multiplication of two number is :"+ result);
            return;
        }else if(choice == 4){
            int result = n1 / n2;
            System.out.println("Division of two number is : "+ result);
            return;
        }else if(choice == 5){
            int result = n1 %  n2;
            System.out.println("Module of two number is :"+ result);
            return;
        }else{
            System.out.println("invalid number, this number is out of my criteria.");
        }
        sc.close();
    }
}

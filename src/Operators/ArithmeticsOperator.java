import  java.util.*;

//----------------------------Arithmetic Operators Examples----------------------
public class ArithmeticsOperator {
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        Scanner  sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter the second number : ");
        int second  = sc.nextInt();
        System.out.println("Enter the operator to perform two operands : ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                int sum = first  + second;
                System.out.println("Sum of given two number is : "+ sum);
                break;
            case '-':
                int abstraction = first - second;
                System.out.println("Abstraction of given two number is : "+ abstraction);
                break;
            case '*':
                int multiplication = first * second;
                System.out.println("Multiplication of given two number : "+ multiplication  );
                break;
            case '/':
                int division = first / second;
                System.out.println("Division of given two number  :"+ division  );
                break;
            case '%':
                int modules = first % second;
                System.out.println("Modules of given two number is : "+ modules);
                break;
            default:
                System.out.println("Invalid Operators please enter correct ");
                break;
        }

    }
}

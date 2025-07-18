//Write a Java program to sum values of an array.

package W3resourcePracticeQuestions;
import  java.util.Scanner;
public class Question2 {
    public static void main(String []args){
        //Declaration of variable
        int size, sum = 0;

        //Make an object of scanner class to take input from user.
        Scanner sc = new Scanner((System.in));

        //Take size from user
        System.out.println("Enter size of array!");
        size = sc.nextInt();

        //Declaration of array
        int arr[] = new int[size];

        //Enter all elements
        System.out.println("Enter elements of array!");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        //print array elements!
        System.out.println("\n Print array elements!");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        //Calculate sum of all array elements.
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        //Pint sum of array elements
        System.out.println("\nSum of array elements is :"+ sum);

        sc.close();
    }

}

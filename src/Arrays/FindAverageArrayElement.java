package Arrays;
import java.util.Scanner;
public class FindAverageArrayElement {
    public static void main(String []args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0, average;

        System.out.println("Enter the array element!");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print array elements!");
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i  = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        average = sum/(arr.length);
        System.out.println("\nAverage of array element : "+ average);

        sc.close();
    }
}

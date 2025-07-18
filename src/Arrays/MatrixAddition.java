package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String []args){
        int arr[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int sum[][] = new int[2][2];

        Scanner  sc = new Scanner(System.in);

        //Enter first array elements
        System.out.println("Enter first array elements!");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Enter second array elements!
        System.out.println("\nEnter second array elements!");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //Print first array elements!
        System.out.println("\nPrint first array elements!");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        //Print second array elements!
        System.out.println("Print second array elements!");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //Addition of two array elements!
        System.out.println("Sum of two matrix array!");
        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum.length; j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

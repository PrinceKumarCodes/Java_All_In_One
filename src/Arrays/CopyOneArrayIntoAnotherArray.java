//---------------Copy one array to another array-------------
package Arrays;
import java.util.Scanner;
public class CopyOneArrayIntoAnotherArray {
    public static void main(String []args){
         int arr[] = new int[5];
         int arr1[] = new int[5];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in first array!");
        for(int i =  0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First array elements!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSecond array elements!");
        for(int i  = 0; i < arr1.length; i++){
            arr1[i]  = arr[i];
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }

}

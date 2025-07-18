//---------------sum of array elements-----------
package Arrays;
import java.util.Scanner;
public class SumArrayElements {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in array!");
        for(int i  = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements : "+ sum);

        sc.close();
    }
}

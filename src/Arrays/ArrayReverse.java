package Arrays;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        int []arr = new int[5]; //array size
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print Actual Elements ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Elements ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}

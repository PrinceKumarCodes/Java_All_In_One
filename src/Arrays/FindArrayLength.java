package Arrays;
import java.util.Scanner;
public class FindArrayLength {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Printed Elements. ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array Length :"+ arr.length );
        sc.close();
    }

}

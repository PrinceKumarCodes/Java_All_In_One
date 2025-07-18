package Arrays;
import  java.util.Scanner;
public class ArrangeArrayAssendingOrder {
    public static void main(String []args){
        int arr[] = new int[5];
        int temp;
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter the array element!");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array element!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("Arrange array in assending order!");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[i] > arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }

        System.out.println("\nPrint array assending order!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

}

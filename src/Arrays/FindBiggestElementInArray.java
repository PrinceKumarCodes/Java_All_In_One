package Arrays;
import java.util.Scanner;

public class FindBiggestElementInArray {
    public static void main(String []args){
        int arr[] = new int[5];
        int temp;
        int biggestVal  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in array!");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        /* -----------first way to find biggest value in the array-------------
        System.out.println("\nPrint array elements!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nFind Biggest element in array!");
        for(int i  = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
               if(arr[i] > arr[j]){
                   biggestVal = arr[i];
               }else{
                 biggestVal = arr[j];
               }
            }
        }
        System.out.println("Biggest value in array : "+ biggestVal);
        */

        //------------------Second way to find Biggest value in array------------
       int  max = arr[0];
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
       System.out.println("Biggest value in array is :"+ max);
       sc.close();
    }
}

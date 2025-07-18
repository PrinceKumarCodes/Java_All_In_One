package Arrays;
import java.util.Scanner;
public class FindSmallestElementInArray {
    public  static void main(String []args){
        int arr[]  = new int[5];
        int smallestVal = 0 , small;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter value in array!");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\n Print array elements!");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        /*
        System.out.println("\nFind smallest array elements!");
        for(int i = 0; i< arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] < arr[j]){
                    smallestVal = arr[i];
                }else{
                    smallestVal = arr[j];
                }
            }
        }
        System.out.println("smallest value in array :" + smallestVal);
        */
        System.out.println("\n Find smallest  value in array!");
        small = arr[0];
         for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
         }
        System.out.println("Smallest value in array!" + small);
        sc.close();
    }

}

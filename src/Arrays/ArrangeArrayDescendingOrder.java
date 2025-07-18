package Arrays;
import java.util.Scanner;
public class ArrangeArrayDescendingOrder {
    public static void main(String[] args) {
        int arr[]  = new  int[5];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements!");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array elements!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
            };

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[i] < arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }

        System.out.println("\nDescending order of given array!");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
        }


    }



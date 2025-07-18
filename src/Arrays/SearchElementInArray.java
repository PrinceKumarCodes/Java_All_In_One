package Arrays;
import java.util.Scanner;
public class SearchElementInArray {

    public static void main(String []args){
        Scanner  sc = new Scanner(System.in);
        int arr[] = new int[5];
        int searchElement, count = 0;

        System.out.println("Enter Array elements!");
        for(int i  = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Printed array element!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("\nEnter search element!");
        searchElement = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchElement){
                 count++;
            }
        }

        if(count>0){
            System.out.println("Item found : "+ count + " times");
        }else{
            System.out.println("Item not found!");
        }
        sc.close();
    }
}

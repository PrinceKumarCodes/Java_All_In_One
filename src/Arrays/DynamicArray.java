package Arrays;
import java.util.Scanner;
public class DynamicArray {
    public static void main(String []args){
        int size, i;
        System.out.println("Enter size of array :");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array element : ");
        for(i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printed array element!");
        for(i = 0; i< size; i++){
            System.out.print(arr[i]+ " ");
            sc.close();
        }
    }
}

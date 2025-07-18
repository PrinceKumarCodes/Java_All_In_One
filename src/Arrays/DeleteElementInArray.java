//--------------------------Delete element in array---------------------------
// arr[3] = 32,43,22
// loc = 1
// arr[3-1] = 32,22

package Arrays;
import java.util.Scanner;
public class DeleteElementInArray {
    public static void main(String[] args) {

        int size;
        int loc;
        //Make object of Scanner class for input
        Scanner  sc = new Scanner(System.in);

        //Enter array elements
        System.out.println("Enter array size!");
        if(!sc.hasNextInt()){//check enter size is valid or not.
            System.out.println("Invalid Input, pls enter valid input for size");
            return;
        }

        size  = sc.nextInt();

        int arr[] = new int[size]; //Declaration array

        System.out.println("Enter "+ size +" array element!");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter position(index), on witch you want to delete element!");
        loc = sc.nextInt();
        if(loc < 0 || loc > size){
            System.out.println("invalid input, pls enter correct location, on which position you want to delete element!");
            return;
        }

        for(int i = loc; i < size-1; i++){
            arr[i]  = arr[i + 1];
        }
        size--;

        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}

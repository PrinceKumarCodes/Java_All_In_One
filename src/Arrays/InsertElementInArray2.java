package Arrays;
import java.util.*;
public class InsertElementInArray2 {
    public static void main(String[] args) {
        //Take scanner for input
        Scanner  sc = new Scanner(System.in);

        //Take size of array.
        System.out.println("Enter Size of Array!");
        if(!sc.hasNextInt()){
            System.out.println("Invalid input, Pls Enter valid integer for size!");
            return;
            //Exit the program if input is invalid
        }

        int size = sc.nextInt();

        //Declaration array +1 size to allow insertion
        int arr[] = new int[size + 1];

        //take element from user.
        System.out.println("Enter "+ size + "array element!");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position (index), where you want to insert element!");
        int loc = sc.nextInt();

        if(loc < 0 || loc > size){//check condition, it's valid location or not.
            System.out.println("Invalid input, please inter number between 0 to size!");
            return;
        }
        System.out.println("\nEnter new items!");
        int item = sc.nextInt();

        for(int i = size; i>loc; i--){
            arr[i] = arr[i - 1];
        }
        arr[loc] = item;
        System.out.println("\nPrint all array element after insert element!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}

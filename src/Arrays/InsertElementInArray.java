package Arrays;
import java.util.*;

/*
public class InsertElementInArray {
    public static void main(String[] args) {
        int size, loc,item, i;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter array size !");
        size = sc.nextInt();
        int arr[] = new int[size + 1];

        System.out.println("Enter array elements!");
        for(i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array locations!");
        loc = sc.nextInt()  ;
        System.out.println("Enter array new item!");
        item = sc.nextInt();
        for(i = size ; i >loc; i--){
            arr[i] = arr[i-1];
        }
        arr[loc] = item;
        size++;

        System.out.println("Print new array after inserting");
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
*/
public class InsertElementInArray {
    public static void main(String[] args) {
        	        Scanner sc = new Scanner(System.in); // Create Scanner for input

        	        // Take array size input
        	        System.out.println("Enter array size:");
        	        if (!sc.hasNextInt()) { // Check if the next input is valid integer
            	            System.out.println("Invalid input. Please enter a valid integer for size.");
            	            return; // Exit the program if input is invalid
            	        }
        	        int size = sc.nextInt(); // line 9

        	        // Declare array with +1 size to allow insertion
        	        int[] arr = new int[size + 1];

        	        // Take array elements input
                System.out.println("Enter " + size + " array elements:");
                for (int i = 0; i < size; i++) {
            	            arr[i] = sc.nextInt(); // Assuming valid integer inputs are given
            	        }

        	        // Take insertion index
        	        System.out.println("Enter position (index) where you want to insert the new element:");
        	        int loc = sc.nextInt();

        	        // Check for valid index
                if (loc < 0 || loc > size) {
            	            System.out.println("Invalid index. It must be between 0 and " + size);
            	            return;
            	        }

        	        // Take new item to insert
        	        System.out.println("Enter the new element to insert:");
        	        int item = sc.nextInt();

        	        // Shift elements to the right to make space
        	        for (int i = size; i > loc; i--) {
            	            arr[i] = arr[i - 1];
            	        }

        	        // Insert the new item
        	        arr[loc] = item;

        	        // Printing the updated array
        	        System.out.println("Array after insertion:");
        	        for (int i = 0; i <= size; i++) { // Change loop condition to include new size
            	            System.out.print(arr[i] + " ");
            	        }
        	        sc.close(); // Close the scanner
        	    }
}
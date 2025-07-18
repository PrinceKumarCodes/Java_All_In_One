//------------sort(), equals() , copyOf()----------
package Arrays;
import  java.util.*;
public class ArrayMethods {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = new int[5];

        System.out.println("Enter value in array!");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nPrint array elements!");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //-------------sort()---------------
        Arrays.sort(arr);//sort in ascending order
        System.out.println("\n sort ascending order!");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //-------------------equals()-----------
        System.out.println("\nEnter value in array2!");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        boolean equal = Arrays.equals(arr, arr2); // it will always return boolean value ( true / false)
        System.out.println("what both arrays is equal :  "+ equal);

        //----------------copyOf()------------
        System.out.println("value of arr3 is 👇👇👇");
        int arr3[] = Arrays.copyOf(arr2, 5);//arr2 is a array , but 5 is a size of new array(arr3);
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+ " ");
        }
        System.out.println("\n value of arr2 is : 👇👇👇");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }



        sc.close();


    }
}

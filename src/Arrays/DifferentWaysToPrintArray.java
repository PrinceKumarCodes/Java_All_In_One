package Arrays;
import java.util.*;
public class DifferentWaysToPrintArray {
    public static void main(String []args){

        //First Way to print array
        int arr[] = new int[3];
        arr[0] = 43;
        arr[1] = 65;
        arr[2] = 70;
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i]+ " ");
        }
    //  Second Way to print array
        System.out.println();
        for(int b : arr){//foreach loop
            System.out.print(b + " ");
        }
    }
}

//-----------------Mirror matrix using 2D Array----------------
package Arrays;
import  java.util.Scanner;
public class MirrorMatrix {
    public static void main(String []args){
        //Declaration of array!
        int [][]arr = new int[2][2];

        //Create object of Scanner Class for input.
        Scanner sc = new Scanner(System.in);

        //Take array elements!
        System.out.println("Enter array Elements!");
        for(int i = 0 ; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Print array elements
        System.out.println("Print array elements!");
        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        // Print Mirror matrix
        System.out.println("\nMirror Array matrix!");
        for(int i = 0; i <= 1; i++){
            for(int j = 1; j >= 0; j--){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }

}

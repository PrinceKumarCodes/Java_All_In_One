//----------------------Matrix program using 2D Array-----------------------
package Arrays;
import java.util.Scanner;
public class Matrix2DArray {

    public static void main(String[] args) {

        int [][]arr = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element!");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print 2D Array Element!");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//For next line
        }
        sc.close();
    }
}

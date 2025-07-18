package Arrays;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String []args){

        //Declaration array!
        int [][]arr = new int[2][2];

        Scanner sc = new Scanner(System.in);//Create object of Scanner class to take input.
        System.out.println("Enter array matrix!");
        for(int i = 0; i <= 1; i++){//rows
            for(int j = 0; j <= 1; j++){//columns
                arr[i][j] = sc.nextInt();
            }
        }
        //Print array elements.
        System.out.println("\nPrint array matrix!");
        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println("\nPrint Transpose Array elements!");
        for(int i = 0; i <= 1; i++){
            for(int j  = 0; j <= 1; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

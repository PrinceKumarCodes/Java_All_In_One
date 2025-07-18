package Arrays;

public class StaticArray {
    public static void main(String []args){
        int []arr2 = new int[5];//---fixed size of array----
        arr2[0] = 43;
        arr2[1] = 44;
        arr2[2] = 54;
        arr2[3] = 53;
        arr2[4] = 60;
        //  arr2[5] = 62; //👈👈👈array ke size jaida value dalne per error dega
        for(int i = 0; i<5; i++){
            System.out.println(arr2[i]);
        }

    }
}

//Write a Java program to sort a numeric array and a string array.
package W3resourcePracticeQuestions;
import  java.util.Arrays;

public class Question1 {
    //the main method where the program execution starts
    public static void main(String[] args) {

        //Declare and initialize an integer array
        int  []my_array1 = {43,64,54,443,543,5,34,543,5443,332};

        //Declare and initialize a string array
        String []my_array2 =  {"prince", "nitish", "sumit","karan","vishal", "amit"};


        //Print the original numeric array
        System.out.println("Print numeric array :"+ Arrays.toString(my_array1));

        //sort the numeric array in ascending order.
        Arrays.sort(my_array1);

        //Print the sorted numeric array
        System.out.println("sorted numeric array: "+ Arrays.toString(my_array1));

        // Print the original string array
        System.out.println("Print string array : "+ Arrays.toString(my_array2));

        //sort the string array in ascending order.
        Arrays.sort(my_array2);

        //Print sorted string array
        System.out.println("Sorted string array :"+ Arrays.toString(my_array2));
    }

}

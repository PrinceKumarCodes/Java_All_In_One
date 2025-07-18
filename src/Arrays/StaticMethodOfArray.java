package Arrays;
import java.util.*;
public class StaticMethodOfArray {
    public static void main(String[] args) {
        String  arr[] = {"prince", "summit", "karan", "amit"};
//        ✅ Arrays.toString()
//        Used to return a string representation of a one-dimensional array.
        System.out.println("toString() " + Arrays.toString(arr));

//        ✅ Arrays.deepToString()
//        Used to return a string representation of a multi dimensional (nested) array.
        System.out.println("asList() "+ Arrays.asList(arr));
        //asList() method reference  value leta hai array ke

        System.out.println("deepToString() "+ Arrays.deepToString(arr));


    }
}

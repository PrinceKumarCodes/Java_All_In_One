//  ==
//  equals

package Arrays;
import  java.util.*;

public class CompareArray {

    public static void main(String []args){
        int a[] = {10, 32,43,54,33,44};
        int b[] = {10, 32,43,54,33,44};

        // if(a == b){ // double equal compare reference of  both array , it doesn't any mean from value.
        //that's it will print : Both are not equal!
        if(Arrays.equals(a,b)){//it will print : Both are equal  //it is compare value not a reference
            System.out.println("Both are equal!");
        }else{
            System.out.println("Both are not equal!");
        }

    }
}

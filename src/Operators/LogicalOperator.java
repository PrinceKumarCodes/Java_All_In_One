package Operators;//-----------------Logical Operator Example--------------

public class LogicalOperator {
    public static void main(String[] args) {
        //-----------------Logical AND------------------
        System.out.println((10 > 5) && (2 > 1));//true
        System.out.println((10 > 5) && (2 < 1));//false
        System.out.println((10 < 5) && (2 > 1));//false

       //---------------------Logical OR----------------
        System.out.println((10 > 5) || (2 > 1));//true
        System.out.println((10 > 5) || (2 < 1));//true
        System.out.println((10 < 5) || (2 > 1));//true

        //------------------Logical NOT-----------------
        System.out.println(!(2 > 1));//false
        System.out.println(!(10 > 5));//false
        System.out.println(!(10 < 5));//true


    }
}

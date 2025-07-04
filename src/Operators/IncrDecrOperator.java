

public class IncrDecrOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //----------Pre increment/Post increment-------------------
        System.out.println("Before increment value of a is :" + a);// Expected output 10
        a++;// 11
        System.out.println("After increment value of a is :" + a);// Expected output 11
        int c = ++a;
        System.out.println("value of c is :" + c); //Expected output 12

        //--------------pre decrement/ Post decrement--------------
        int d = b--; //5
        System.out.println("value of d is :" + d);//Expected output 5
        System.out.println("value of b is :" + b);//Expected output 4
        int e = --b;
        System.out.println("value of e is :" + e); //Expected output 3
        System.out.println("value of b is :" + b); //Expected output 3

    }
}

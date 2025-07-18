package Operators;

//--------------Ternary Operator Example(it's called conditional operator)-----------
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10,b = 8, c = 12, max;
        // max = (a>b) ? a : b;
        // System.out.println(max);
        max = (a>b)?(a>c ? a : c) : (b>c ? b : c);
        System.out.println(max);

    }
}
package TypeCasting;//--------------------Explicit TypeCasting.ImplicitCasting------------------
// By default the compiler, doesn't  allow  the explicit typecasting

public class ExplicitCasting {
    public static void main(String[] args) {
        double a = 10.5;  //8 Bytes
        int b = (int)a;  //4 bytes
        System.out.println(b);

    }
}

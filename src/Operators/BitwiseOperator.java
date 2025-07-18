package Operators;

//------------------Bitwise operator------------
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("AND : "+(a & b)); //Expected output 5
        System.out.println("OR :"+(a | b)); //Expected output 7
        System.out.println("XOR :"+ (a ^ b)); //Expected output 2
        System.out.println("Complement :"+ (~a)); //Expected output -6
    }
    
}

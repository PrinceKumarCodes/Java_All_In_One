package Operators;//----------------Assignment Operators Example--------------------
// Assignment operator is a part of unary operator(only =)
//There are two types of assignment operator
// 1) Simple assignment operator(=)
// 2) Compound assignment operator( -=, +=, *=, /=, 5=)

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10; //Simple
        System.out.println(a);

        a+=10; //compound(a =  a + 10)
        System.out.println(a);
        a-=10; //compound(a = a-10)
        System.out.println(a);

    }
}


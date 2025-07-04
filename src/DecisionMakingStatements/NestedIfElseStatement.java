//-------------Nested if else statement-------------

public class NestedIfElseStatement {
    public static void main(String []args){
        int a = 30, b = 35, c = 20;
        if(a > b){
            if(a > c){
                System.out.println("Maximum number is :"+ a);
            }else {
                System.out.println("Maximum number is :"+ c);
            }
        }else{
            if(b > c){
                System.out.println("Maximum number is :"+ b);
            }else{
                System.out.println("maximum number is :"+ c);
            }
        }
    }
}

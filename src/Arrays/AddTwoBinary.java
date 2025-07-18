package Arrays;

public class AddTwoBinary {
    static String add_Binary(String x, String y){
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        String x = "10", y = "11";
        System.out.println(add_Binary(x, y));

    }
}

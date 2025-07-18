package LocalProgram;
import java.util.Scanner;
public class CheckVowel {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character..");
        int ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Enter character is a vowel");
        }else{
            System.out.println("Enter character is a consonant");
        }
        sc.close();
    }
}

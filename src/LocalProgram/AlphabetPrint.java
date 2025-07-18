package LocalProgram;

public class AlphabetPrint {
    public static void main(String[] args) {
        char ch;
        System.out.println("Print small all alphabet...");
        for(ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("Print upper all alphabet...");
        for(ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }
    }
}

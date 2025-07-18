package LoopingStatements;

public class ForEachLoop {
    public static void main(String[] args) {
        int []a = {10, 20, 30, 40, 50};
        //--------------for each loop--------------
        System.out.println("By using for each loop ");
        for(int b : a){
            System.out.println( b + " ");
        }
        //------------By using for loop------------
        System.out.println("by using for loop");
        for(int i = 0; i <a.length - 1; i++){
            System.out.println(" "+ a[i]);
        }
    }
}

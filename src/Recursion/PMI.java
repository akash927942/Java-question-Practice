package Recursion;

public class PMI {

    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int small=sum(n-1);
        return n+small;
    }
    public static void main(String []args){
        int n=5;

        System.out.println(sum(n));

    }

}

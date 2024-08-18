package Bit;

public class decimalToBinary {
    public static void main(String[] args) {
        int n=9;
        String ans="";
        while(n !=0){
            int n1=n%2;
            ans=n1+ans;
            n=n>>1;
        }
        System.out.println(ans);
    }
}

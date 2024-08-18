package Recursion;

public class factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int res=fact(n-1);
        return res*n;
    }
    public static void main(String []args){
        int n=5;
        //factorial f=new factorial();
        int ans =fact(n);
        System.out.println(ans);
    }
}

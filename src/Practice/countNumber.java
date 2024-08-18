package Practice;

public class countNumber {
    public static void main(String[] args) {
        int m=1;
        int n=30;
        int x=2;
        System.out.println(count(m,n,x));

    }
    public static int count(int m ,int n ,int x){
        int ans=0;
        for (int i=m;i<=n;i++){
           int a=i;
           while (a !=0){
               int l=a%10;
               if(l == x){
                   ans++;
               }
               a /=10;
           }
        }

        return ans;

    }
}

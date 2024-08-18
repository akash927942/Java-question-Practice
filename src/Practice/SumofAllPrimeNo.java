package Practice;

public class SumofAllPrimeNo {
    public static void main(String[] args) {
        int n=10;
        int ans=0;
        for (int i=2;i<=n;i++){
            int mul=0;
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    mul++;
                }
            }
            if (mul==1){
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}

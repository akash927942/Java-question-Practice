package Practice;

public class BItmagicnumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Integer.toBinaryString(5));
        int ans=0;

        for (int i=1;i<=n;i++){
            int x=i;
            int sum=0;
            while (x!=0){
                if ((x&1)==1){
                    sum+=2;
                }
                else {
                    sum+=1;
                }

                x=x>>1;
            }
            if (sum%2!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

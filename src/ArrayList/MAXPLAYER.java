package ArrayList;

public class MAXPLAYER {
    public static void main(String[] args) {
        int n=6;
        int m=5;
        int ans=0;

        while (n+m>3 && n>0 && m>0){
            if (n>0 && m>0){
                n--;
                m--;
            }
            if (n>m && n>1){
                n=n-2;
            } else if (m>n && m>1) {
                m=m-2;
            } else if (n+m==2) {
                n=0;
                m=0;
            }
            ans ++;

        }
        System.out.println(ans);
    }
}

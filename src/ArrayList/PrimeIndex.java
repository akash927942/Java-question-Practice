package ArrayList;

public class PrimeIndex {
    public static void main(String[] args) {
        int [ ]ar={10,20,30,40,50,60,70,80};
        int ans=0;

        for (int i=2;i<ar.length;i++){
            int count =0;
            for (int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count ==1){
                ans +=ar[i];
            }
        }
        System.out.println(ans);
    }
}

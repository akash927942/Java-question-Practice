package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class RPGinfosis {
    public static void main(String[] args) {
        int n=3;
        int e=100;
        int []power={101,100,304};
        int[] bonus={100,1,524};
        RPGinfosis q=new RPGinfosis();
        int a=q.rpg(n,e,power,bonus);
        System.out.println(a);

    }

    public int rpg(int n,int e,int[] power,int[] bonus){
        int ans=0;
        int[][] sorted=new int[n][2];
        for (int i=0;i<n;i++){
            sorted[i][0]=power[i];
            sorted[i][1]=bonus[i];
        }
        Arrays.sort(sorted, Comparator.comparingDouble(o ->o[0]));
        for (int i=0;i<n;i++){
            if (sorted[i][0]<=e){
                ans++;
                e+=sorted[i][1];
            }
        }


        System.out.println(Arrays.deepToString(sorted));
        return ans;
    }
}

package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfPairs {
    // nlogn

    public int MLP(int [][] ar){

        Arrays.sort(ar, Comparator.comparingDouble(o->o[1]));
        int ans=1;
        int pairend=ar[0][1];
        for (int i=0;i<ar.length;i++){
            if (pairend<=ar[i][0]){
                ans++;
                pairend=ar[i][1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][]ar={{5,24},{39,60},{5,28},{27,40},{50,90}};
        MaxLengthOfPairs mp=new MaxLengthOfPairs();
        System.out.println(mp.MLP(ar));
    }
}

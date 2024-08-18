package Greedy;

import java.util.Arrays;

public class MinAbsoluteDifference {
    //O(nlogn)
    public int MAD(int[]ar1,int[]ar2){
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int ans=0;
        for(int i=0;i<ar1.length;i++){
            ans+=Math.abs(ar1[i]-ar2[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]a1={1,2,3};
        int[]a2={2,4,1};
        MinAbsoluteDifference m=new MinAbsoluteDifference();
        System.out.println(m.MAD(a1,a2));
    }
}

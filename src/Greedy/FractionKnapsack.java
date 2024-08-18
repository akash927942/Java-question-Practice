package Greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionKnapsack {

    public void FKNS(int[] val,int[] weight,int w){

        double [][] st=new double[val.length][2];
        for (int i=0;i<val.length;i++){
            st[i][0]=i;
            st[i][1]=(val[i]/(double)weight[i]);
        }
        Arrays.sort(st, Comparator.comparingDouble(o ->o[1]));
        int ans=0;
        int lc=w;

        for (int i= val.length-1;i>=0;i--){
            int idx=(int)st[i][0];
            if (lc>=weight[idx]){
                ans+=val[idx];
                lc-=weight[idx];
            }
            else {
                ans+=(st[i][1]*lc);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] val={60,100,120};
        int[] weit={10,20,30};
        FractionKnapsack f=new FractionKnapsack();
        f.FKNS(val,weit,50);
    }
}

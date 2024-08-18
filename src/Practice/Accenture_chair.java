package Practice;

import java.util.Arrays;

public class Accenture_chair {
    public static int[] totalchair(String [] sim){
        int n=sim.length;
        int [] ans=new int[n];
        for (int i=0 ;i<n;i++){
            int TC=0;//1+
            int AC=0;//
            int len=sim[i].length();
            for (int j=0;j<len;j++){
                if(sim[i].charAt(j)=='C' ||sim[i].charAt(j)=='U' && AC==0){
                    TC++;
                } else if (sim[i].charAt(j)=='C' ||sim[i].charAt(j)=='U' && AC>0) {
                    AC--;
                } else if (sim[i].charAt(j)=='R' ||sim[i].charAt(j)=='L' && AC==0) {
                    AC++;
                } else if (sim[i].charAt(j)=='R' ||sim[i].charAt(j)=='L' && AC==0) {
                    AC++;
                }
            }
            ans[i]=TC;
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] que={"CCRUCL","CRUC","CCCC"};
        int []abc=Accenture_chair.totalchair(que);

        System.out.println(Arrays.toString(abc));

    }
}

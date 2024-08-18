package Practice;

import ArrayList.Arrlist;

import java.util.ArrayList;

public class BitInfosis {
    public static void main(String[] args) {
        int N=5;
        int[]ar={15,6,5,12,1};
        BitInfosis bq=new BitInfosis();
        bq.biti(N,ar);

    }
    public void biti(int n,int[]ar){
       // int max=0;
        int fmax=0;
        ArrayList<Integer>al=new ArrayList<>();

        for (int i=0;i<n-1;i++){

            int max=0;

            for (int j=i;j<n-1;j++) {
                if (((ar[j] & ar[j + 1])* 2) < (ar[j] | ar[j + 1])) {
                    max++;


                }
                else {

                    break;
                }
            }
            if (fmax<max){
                fmax=max;
            }
        }
        System.out.println(fmax);
    }

}

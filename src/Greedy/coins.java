package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class coins {
    public void mincoin(Integer[] coin,int rs){
        Arrays.sort(coin, Comparator.reverseOrder());
        int tc=0;
        int leftamt=rs;
        ArrayList<Integer> currency=new ArrayList<>();

        for (int i=0;i<coin.length;i++) {
            while (coin[i] <= leftamt) {
                if (coin[i] <= leftamt) {
                    tc++;
                    leftamt = leftamt - coin[i];
                    currency.add(coin[i]);

                }
            }
        }
        System.out.println("total coins"+tc);
        for (int i=0;i< currency.size();i++){
            System.out.print(currency.get(i)+" ");
        }

    }

    public static void main(String[] args) {
        Integer[] cr={1,2,5,10,20,50,100,200,500,2000};
        coins c=new coins();
        c.mincoin(cr,5009);
    }
}

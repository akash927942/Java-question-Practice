package ArrayList;

import java.util.HashMap;

public class SeccondAccurence {
    public static void main(String[] args) {
        int [] a={1,2,3,4,4,4,5,5,5,5,5,6,6,6,6};



//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for (int i=0;i<a.length;i++){
//            if (hm.containsKey(a[i])){
//                hm.put(a[i],hm.get(a[i])+1);
//            }
//            else {
//                hm.put(a[i],1);
//            }
//        }
//        System.out.println(hm);

        int flar=0;
        int fc=0;
        int slar=0;
        int sc=0;

        int current=a[0];
        int count=1;

        for (int i=1;i<a.length;i++){
            if (a[i]==current){
                count++;
            }
            else {
                if (count>fc){
                    slar=flar;
                    sc=fc;
                    flar=current;
                    fc=count;
                }
                else if (count<fc && count>sc){
                    slar=current;
                    sc=count;
                }
                current=a[i];
                count=1;

            }
        }
        if (count<fc && count>sc){
            slar=current;
            sc=count;
        }
        System.out.println(flar+" "+fc);
        System.out.println(slar +"  "+sc);
        

    }
}

package HashMap;
import java.util.*;
//import java.util.HashMap;

public class Frequency_count {
    public static void main(String[] args) {
        int [] a={1,2,4,5,7,5,6,8,4,56,2,1,5,44,5,7,4,1,0,2,5,7,8,441,4,44,7,8,5,1,4,45,47,1};

        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        System.out.print(hm);
        ArrayList<Integer>ar=new ArrayList<>();
        for (int ab: hm.keySet()){
            ar.add(hm.get(ab));
        }
        Collections.sort(ar);
        System.out.println(ar);
        int lar=ar.get(ar.size()-1);
//        System.out.println(hm.get());
    }
}

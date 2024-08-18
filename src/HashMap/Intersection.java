package HashMap;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> h1=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            h1.add(arr1[i]);
        }
        int count=0;
        ArrayList<Integer> Au=new ArrayList<>();

        for (int i=0;i< arr2.length;i++){
            if (h1.contains(arr2[i])){
                count++;
                Au.add(arr2[i]);
                h1.remove(arr2[i]);

            }
        }
        System.out.println(Au);
    }
}

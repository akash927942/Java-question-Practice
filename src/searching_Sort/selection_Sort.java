package searching_Sort;

import java.util.Arrays;

public class selection_Sort {
    public void sort1(int []arr){


        for (int i=0;i<arr.length-1;i++){
            int current=i;
            for (int j=i;j<arr.length;j++)
            if (arr[current]>arr[j]){
                current=j;
            }
            int temp=arr[i];
            arr[i]=arr[current];
            arr[current]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));


        }
    public static void main(String[] args){
        int[] arr={44,98498,54,7,3241,87,1,8,47,18,0,8584,5184,518574,518,4,98,7451,874,548,41};
        selection_Sort sc= new selection_Sort();
        sc.sort1(arr);


    }
}

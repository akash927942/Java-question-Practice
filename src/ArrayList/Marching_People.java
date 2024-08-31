package ArrayList;

import java.util.Arrays;

public class Marching_People {
    public static void main(String[] args) {
//        int a[][]={{1,2,3},{3,4,2},{6,3,2},{9,3,2},{11,3,2}};
        int a[][]={{2,3,3},{4,6,4}};
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        int narr[][]=new int[a.length][2];
        for (int i=0;i<a.length;i++){

                narr[i][0]=a[i][0];
                narr[i][1]=a[i][0]+a[i][2];

        }
       // System.out.println(Arrays.deepToString(narr));

        int ans=0;
        ans=(narr[0][1]-narr[0][0]+1);
        //System.out.println(narr[1][1]+" "+ans);
        for (int i=1;i<narr.length;i++){
            if (narr[i-1][1]>narr[i][0]){
                ans+=narr[i][1]-narr[i-1][1];
            }
            else if(narr[i-1][1]<narr[i][0]){
                ans+=narr[i][1]-narr[i][0]+1;
            }
            else {
                ans+=narr[i][1]-narr[i][0];
            }

        }
        System.out.println(ans);


    }
}

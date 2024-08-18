package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    //sorted end
    public void sortedend(int[] start,int []end){

        ArrayList<Integer> activity=new ArrayList<>();
        int count=0;

        //1st activity
        count=1;
        activity.add(0);
        int last=end[0];
        for (int i=1;i<start.length;i++){
            if (last<=start[i]){
                activity.add(i);
                last=end[i];
                count++;
            }
        }
        System.out.println("total possible activity "+count);
        for (int i=0;i<activity.size();i++){
            System.out.print("A"+activity.get(i)+" ");
        }

    }
    public void unsorted(int[] start,int []end){
        //sorting
        int [][] st=new int[start.length][3];
        for (int i=0;i< start.length;i++){
            st[i][0]=i;
            st[i][1]=start[i];
            st[i][2]=end[i];
        }
        Arrays.sort(st, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> activity=new ArrayList<>();
        int count=0;

        //1st activity
        count=1;
        activity.add(0);
        int last=st[0][2];
        for (int i=1;i<start.length;i++){
            if (last<=st[i][1]){
                activity.add(i);
                last=st[i][2];
                count++;
            }
        }
        System.out.println("total possible activity "+count);
        for (int i=0;i<activity.size();i++){
            System.out.print("A"+activity.get(i)+" ");
        }

    }



    public static void main(String[] args) {
        int[] start={1,0,3,5,8,5};
        int[] end={2,6,4,7,9,9};
        ActivitySelection so=new ActivitySelection();
        so.unsorted(start,end);

    }
}

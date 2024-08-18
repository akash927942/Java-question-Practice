package Practice;

import java.util.Arrays;

public class BIt {
    public static void main(String[] args) {
       int []num={10,41,18,50,43,31,29,25,59,96,67,55,3};
       
        System.out.println(findpin(num));
    }
public static int findpin(int [] input1){
        int sum=0;
        int last=0;

        for (int i=0;i<input1.length;i++){

            int ele=input1[i];
            //System.out.println(ele);
            boolean a=true;
            for (int j=2;j<ele;j++){
                //System.out.println(ele);
                if (ele%j==0){
                    a=false;
                    break;
                }
            }
            //System.out.println(a);
            if (a==true){
                sum=sum+ele;
                //System.out.println(sum);
                last=ele;
            }
        }
    //System.out.println(last);
        return sum-last;

}




}

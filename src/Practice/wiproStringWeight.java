package Practice;

public class wiproStringWeight {
    public static void main(String[] args) {
        int []a={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        String s="Wipro Limited";
        wiproStringWeight.wf(a,s);
    }
    static int wf(int []wt,String st){
        int ans=1;

        for (int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if (ch ==' '){
                continue;
            }
            ch=Character.toLowerCase(ch);
            int idx=ch-'a';
            int index=wt[idx];
            System.out.println(idx +" "+index);



        }




        return ans;
    }
}

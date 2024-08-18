package ArrayList;

public class Most_Accure {
    public static void main(String[] args) {
        int [] a={1,2,4,5,7,5,6,8,4,56,2,1,5,44,5,7,4,1,0,2,5,7,8,441,4,44,7,8,5,1,4,45,47,1};
        int most=0;
        int pc=0;
        int count=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j< a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if (pc<count){
                pc=count;
                count=0;
                most=a[i];
            }
            count=0;
        }
        System.out.println(most+" "+pc);

    }
}

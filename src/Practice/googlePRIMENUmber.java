package Practice;

public class googlePRIMENUmber {
    public static void main(String[] args) {
        int n=22;
        int sum=0;
        while (n!=0){
            int x=n%10;
            sum +=x;
            n=n/10;
        }
        int count=0;
        for (int i=2;i<=sum;i++){
            if (sum%i==0){
                count++;
            }
        }
        if (count>1){
            System.out.println("Not google");
        }
        else {
            System.out.println("Yes google");
        }
    }
}

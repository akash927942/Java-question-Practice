package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM {
    public static int findlcm(int []ar){
        int ans=1;
        for (int i=0;i<ar.length-1;i++){
            int lcm=(ar[i]*ar[i+1]) / (gcd(ar[i],ar[i+1]));
            ans=(ans*lcm)/(gcd(ans,lcm));
        }
        return ans;

    }
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int[] ar={12,18,72};
        int ans=LCM.findlcm(ar);
        System.out.println(ans);
    }










        // Function to calculate the GCD (Greatest Common Divisor) of two numbers
//        private static int gcd(int a, int b) {
//            if (b == 0) {
//                return a;
//            }
//            return gcd(b, a % b);
//        }
//
//        // Function to calculate the LCM of two numbers
//        private static int lcm(int a, int b) {
//            return (a * b) / gcd(a, b);
//        }
//
//        // Function to calculate the LCM of a list of numbers
//        public static int findLCM(List<Integer> numbers) {
//            int result = numbers.get(0);
//            for (int i = 1; i < numbers.size(); i++) {
//                result = lcm(result, numbers.get(i));
//            }
//            return result;
//        }
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter the size of the list:");
//            int n = scanner.nextInt();
//
//            List<Integer> numbers = new ArrayList<>();
//            System.out.println("Enter the numbers:");
//            for (int i = 0; i < n; i++) {
//                numbers.add(scanner.nextInt());
//            }
//
//            int lcm = findLCM(numbers);
//            System.out.println("The LCM of the list is: " + lcm);
//
//            scanner.close();
//        }


}

package Practice;

import test.Str;

import java.util.Stack;

public class rev {
    public static void main(String[] args) {
//        String s = "AkaSh";
//        System.out.println(s.length());
//       // String ans;
//        StringBuilder st=new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 0){
//                if(s.charAt(i)<97){
//                    st.append(s.charAt(i+37));
//                }
//            }
//            else {
//                if (s.charAt(i)>97) {
//
//                    st.append(s.charAt(i - 32));
//                }
//            }
//        }

            // Using String
//            long smmtartTime = System.currentTimeMillis();
//            String str = "";
//            for (int i = 0; i < 10000; i++) {
//                str += "a";
//            }
//            long endTime = System.currentTimeMillis();
//            System.out.println("String time: " + (endTime - smmtartTime) + " ms");
//
//            // Using StringBuilder
//            smmtartTime = System.currentTimeMillis();
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < 10000; i++) {
//                sb.append("a");
//            }
//            endTime = System.currentTimeMillis();
//            System.out.println("StringBuilder time: " + (endTime - smmtartTime) + " ms");


        Stack s1=new Stack<>();
        s1.push(10);
        System.out.println(s1.peek());
        System.out.println(s1.size());
        }
    }




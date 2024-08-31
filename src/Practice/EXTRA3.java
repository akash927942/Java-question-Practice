package Practice;

import java.util.*;

public class EXTRA3 {
     public static void main(String[] args) {
         int i, j, k, n, p, q, r, s, t;
         Scanner scn = new Scanner(System.in);
         n = scn.nextInt();
         if (n <= 1) {
             System.out.println("You cannot generate christmas tree");
         } else if (n > 20) {
             System.out.println("Tree is no more");
         } else {
             for (i = 0; i < n + 1; i++) {
                 for (j = i; j < n; j++) {
                     System.out.print(" ");
                 }
                 for (k = 0; k <= (2 * i); k++) {
                     System.out.print("*");
                 }
                 System.out.println();
             }
             if (n > 2) {
                 for (s = 0; s < n - 1; s++) {
                     for (p = s; p < n - 1; p++) {
                         System.out.print(" ");
                     }
                     for (q = 0; q < (2 * (s + 2)) - 1; q++) {
                         System.out.print("*");
                     }
                     for (p = s; p < n - 1; p++) {
                         System.out.print(" ");
                     }
                     System.out.println();
                 }
                 for (t = 0; t < n - 3; t++) {
                     for (s = 0; s < n - 2; s++) {
                         for (p = s; p < n - 1; p++) {
                             System.out.print(" ");
                         }
                         for (q = 0; q < (2 * (s + 2)) - 1; q++) {
                             System.out.print("*");
                         }
                         for (p = s; p < n - 1; p++) {
                             System.out.print(" ");
                         }
                         System.out.println();
                     }
                 }
             }
             for (p = 0; p < 2; p++) {
                 for (q = 0; q < n; q++) {
                     System.out.print(" ");
                 }
                 System.out.print("*");
                 for (q = 0; q < n; q++) {
                     System.out.print(" ");
                 }
                 System.out.println();
             }
         }
         return;
     }


    }

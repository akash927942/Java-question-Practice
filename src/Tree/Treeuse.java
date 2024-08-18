package Tree;

import java.util.Scanner;

public class Treeuse {
    public static TreeNode<Integer> input(){

        System.out.println("Enter next node");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeNode<Integer> root=new TreeNode<>(n);

        System.out.println("Enter no. of child "+n);
        int ch=sc.nextInt();
        for(int i=1;i<=ch;i++){
            System.out.println("enter the "+ i +" child node "+n );
            TreeNode<Integer> child=input();
            root.children.add(child);

        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s=root.data+":";
        for(int i=0;i<root.children.size();i++){
            s= s+ root.children.get(i).data +",";
        }
        System.out.println(s);
        for (int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }


    }


    public static void main(String[] args) {
        TreeNode<Integer>root=input();
       // System.out.println(root.data);
        print(root);

    }
}

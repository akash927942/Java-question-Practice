package Tree;

public class TreeUsemanual {
    public static void main(String[] args) {
        TreeNode<Integer> root=new TreeNode<>(10);
        TreeNode<Integer> c1=new TreeNode<>(10);
        TreeNode<Integer> c2=new TreeNode<>(10);
        TreeNode<Integer> c3=new TreeNode<>(10);
        TreeNode<Integer> c21=new TreeNode<>(10);
        TreeNode<Integer> c22=new TreeNode<>(10);
        TreeNode<Integer> c23=new TreeNode<>(10);

        root.children.add(c1);
        root.children.add(c2);
        root.children.add(c3);
        c2.children.add(c21);
        c2.children.add(c22);
        c2.children.add(c23);

        System.out.println(root.data);
    }
}

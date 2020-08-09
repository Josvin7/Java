package java_20200809;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/8/9 22:16
 */
public class Test2 {
    static class TreeNode {
        public char val; // 根据数据输入结果, 树的每个节点都是一个字符.
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            //System.out.println(line);
            // 读到先序结果后, 就可以构建树了
            // TreeNode root = buildTree(line);
            int index = 0;
            TreeNode root = createTreePreOrder(line);
            inOrder(root);  // 打印的每个结果之间都要用空格分割开.
            System.out.println();
        }
    }

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    //private static int tmp =0;
    private static TreeNode createTreePreOrder(String line) {

       return null;
    }


}

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName BuildTree
 * @Description
 * @Author by房文辉
 * @Date 2020/5/6 12:15
 */
public class BuildTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            index = 0;
            TreeNode root = creatTreePreOrder(line);
            inOrder(root);
            System.out.println();
        }
    }

    private static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    private static TreeNode creatTreePreOrder(String line) {
        char ch = line.charAt(index);
        if(ch == '#') {
            return null;
        }
        TreeNode node = new TreeNode(ch);
        index++;
        node.left = creatTreePreOrder(line);
        index++;
        node.right = creatTreePreOrder(line );
        return node;

    }


}

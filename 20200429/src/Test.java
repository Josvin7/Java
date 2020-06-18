/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/4/29 19:41
 */
public class Test {
    static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    //构造一棵树
    static Node build() {
        // 通过 build 方法构建一棵树, 返回树的根节点.
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = G;
        C.left = F;
        return A;
    }
    public static void preOrder(Node root ) {
        if(root==null) {
            return ;
        }
        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] args) {
        Node root = build();
        preOrder(root);
    }
}

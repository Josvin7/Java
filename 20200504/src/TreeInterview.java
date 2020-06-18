import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TreeInterview
 * @Description
 * @Author by房文辉
 * @Date 2020/5/4 21:13
 */
public class TreeInterview {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 先序遍历 s 这个树, 访问到某个节点时, "访问" 操作就是 isSameTree 的判定
        if(s==null) {
            return false;
        }


        return isSameTree(s,t) || isSubtree(s.left,t)  || isSubtree(s.right,t);


    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left==null && root.right == null) {
            return 1;
        }
        int leftDepth = maxDepth(root.right);
        int rightDepth = maxDepth(root.left);
        return 1+(leftDepth > rightDepth ? leftDepth : rightDepth);

    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.right == null && root.left==null) {
            return true;
        }
        int leftDepth = maxDepth(root.right);
        int rightDepth = maxDepth(root.left);
        return (leftDepth - rightDepth<=1 || rightDepth - leftDepth <=1)&&isBalanced(root.left)&&isBalanced(root.right);

    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isMirror(root.left,root.right);

    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return true;
        }
        if(t1==null ||t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);

    }

    public void levelOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            if(cur.left!= null) {
                queue.offer(cur.left);
            }
            if(cur.right!= null) {
                queue.offer(cur.right);
            }


        }

    }

    public static TreeNode build() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node33 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node44 = new TreeNode(4);

        node1.left = node2;
        node1.right = node22;
        node2.left = node3;
        node2.right = node33;
        node3.left = node4;
        node3.right = node44;
        return node1;
    }

    public static TreeNode build2() {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = G;
        C.right = F;
        return A;
    }

    public static void main(String[] args) {
//        TreeNode root = build();
//        TreeInterview interview = new TreeInterview();
//        boolean ret = interview.isBalanced(root);
//        System.out.println(ret);

        TreeNode root = build2();
        TreeInterview interview = new TreeInterview();
        interview.levelOrder(root);
    }
}

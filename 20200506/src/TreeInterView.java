import java.util.ArrayList;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TreeInterView
 * @Description
 * @Author by房文辉
 * @Date 2020/5/6 12:48
 */
public class TreeInterView {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root ==null) {
            return result;
        }
        result.clear();
        levelOrderHelper(root,0);
        return result;

    }

    private void levelOrderHelper(TreeNode root, int level) {
        if(level == result.size()) {
            result.add(new ArrayList<>());
        }
        List<Integer> curRow = result.get(level);
        curRow.add(root.val);
        if(root.left != null) {
            levelOrderHelper(root.left,level+1);
        }
        if(root.right != null) {
            levelOrderHelper(root.right,level+1);
        }
    }


}

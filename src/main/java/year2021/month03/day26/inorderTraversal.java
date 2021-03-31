package year2021.month03.day26;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author dujialun
 * @description
 * @data 2021/03/26 10/40
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
// 输出二叉树中序遍历
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return null;
        }else {
            traverse(root,list);
        }
        return list;
    }
    // 递归完成中序遍历
    public void traverse(TreeNode node,List<Integer> list) {
        if (node !=null) {
            traverse(node.left,list);
            list.add(node.val);
            traverse(node.right,list);
        }
    }

    public List<Integer> inorderTraversalByStack(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        // 用栈，递归完成二叉树中序遍历
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            // 当根空，且栈空的时候结束循环
            if (root != null) {
                // 中序先push根节点，然后左孩子，最后右孩子
                stack.push(root);
                root = root.left;
            }else {
                // 出栈的时候读入列表
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}

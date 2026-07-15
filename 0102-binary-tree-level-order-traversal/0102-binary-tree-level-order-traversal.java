/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> traversal(TreeNode root , List<List<Integer>> ll){
        if(root == null){
            return ll;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(! q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                ll.add(list);
                 list = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else {
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return ll;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
       return traversal(root , ll);
    }
}
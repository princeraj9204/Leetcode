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
    public static int levelsum(TreeNode root){
        if(root == null){
            return 0;
        }
        int count = 0;
        int h = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                count++;
                if(max<sum){
                    max = sum;
                    h = count;
                }
                   sum = 0;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                sum += currNode.val;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return h;
    }
    public int maxLevelSum(TreeNode root) {
        return levelsum(root);
    }
}
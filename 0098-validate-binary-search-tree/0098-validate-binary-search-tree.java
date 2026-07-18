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
    public static void bst(TreeNode root ,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        bst(root.left,list);
        list.add(root.val);
        bst(root.right , list);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        bst(root , list);
        for(int i=1;i<list.size();i++){
            if(list.get(i) <= list.get(i-1) ){
                return false;
            }
        }
        return true;
    }
}
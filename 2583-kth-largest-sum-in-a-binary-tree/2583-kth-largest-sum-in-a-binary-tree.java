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
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Long> list = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.remove();

                sum += curr.val;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            list.add(sum);
        }

        if (list.size() < k) {
            return -1;
        }

        Collections.sort(list, Collections.reverseOrder());

        return list.get(k - 1);
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null) return ls;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int c = 0;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> tempo = new ArrayList<>();
            for(int i = 0;i<s;i++){
                TreeNode node = q.poll();
                tempo.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            if(c%2!=0){
                Collections.reverse(tempo);
            }
            ls.add(tempo);
            c++;
        }
        return ls;
    }
}
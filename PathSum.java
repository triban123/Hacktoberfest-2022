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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        helper(root,targetSum,new ArrayList<Integer>(),res);
        return res;
    }
    public void helper(TreeNode root,int sum,List<Integer> soln,List<List<Integer>> res){
        if(root==null) return;
        soln.add(root.val);
        if(root.left == null && root.right==null && sum==root.val){
            res.add(new ArrayList<Integer>(soln));
        }
        else{
        helper(root.left,sum-root.val,soln,res);
        helper(root.right,sum-root.val,soln,res);
        }
        soln.remove(soln.size()-1);
    }
}

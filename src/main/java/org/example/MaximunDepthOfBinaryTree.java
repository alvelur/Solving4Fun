package org.example;
import java.util.Stack;

public class MaximunDepthOfBinaryTree {
    public static void main(String[] args) {

        }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        stack.push(root);
        int max = 0;

        while(!stack.isEmpty()){
            TreeNode actual = stack.pop();
            int actualProf = count.pop();

            if(actual.left != null || actual.right != null) {
                if(actual.left != null ){
                    stack.push(actual.left);
                    count.push(actualProf+1);
                }
                if (actual.right != null) {
                    stack.push(actual.right);
                    count.push(actualProf+1);
                }
            }

            if(actual.right == null && actual.left ==null){
                if(max <= actualProf){
                    max = actualProf;
                }
            }
        }
        return max;
    }


    public static class TreeNode {
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
}


package org.example;

import sun.reflect.generics.tree.Tree;

import java.util.Enumeration;
import java.util.Stack;

public class MaximunDepthOfBinaryTree {
    public static void main(String[] args) {

        }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        count = 1;

        while(!stack.isEmpty()){
            TreeNode actual = stack.pop();

            if(actual.left != null){
                stack.push(actual.left);
                count++;
            }
            if(actual.right != null){
                stack.push(actual.right);
                count++;
            }
        }

        return count;

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

package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null && targetSum == 0) return true;
        else {
            if (root == null) return false;

        }
        Queue<TreeNode> treeQueue = new LinkedList<>();
        Queue<Integer> count = new LinkedList<>();



        treeQueue.add(root);
        count.add(root.val);

        while(!treeQueue.isEmpty()){
            TreeNode actual = treeQueue.remove();
            int sum = count.remove();

            if(actual.left != null || actual.right != null) {
                if(actual.left != null ){
                    treeQueue.add(actual.left);
                    count.add(actual.left.val + actual.val);
                }
                if (actual.right != null) {
                    treeQueue.add(actual.right);
                    count.add(actual.right.val  + actual.val);
                }
            }

            if(actual.right == null && actual.left ==null){
                if(targetSum == sum){
                    return true;
                }
            }

        }

        return false;
    }

}


package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        Queue<TreeNode> treeQueue = new LinkedList<>();
        Queue<Integer> count = new LinkedList<>();

        treeQueue.add(root);
        count.add(root.val);

        while(!treeQueue.isEmpty()){
            TreeNode actual = treeQueue.remove();
            int sum = count.remove();
            System.out.println(sum);

                if(actual.left != null ){
                    treeQueue.add(actual.left);
                    count.add(actual.left.val + sum);
                }
                if (actual.right != null) {
                    treeQueue.add(actual.right);
                    count.add(actual.right.val  + sum);
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


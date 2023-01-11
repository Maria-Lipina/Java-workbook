package example;

import example.OneClassTasks.TreeNode;

public class Main {
    public static void main(String[] args) {
        //
        TreeNode tree = new TreeNode(10);
        tree.setLeft(new TreeNode(5,
                new TreeNode(3), new TreeNode(2)));
        tree.setRight(new TreeNode(11, new TreeNode(12)
                ));
        System.out.println(tree);


    }
}
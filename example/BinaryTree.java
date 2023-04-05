package example;

public class BinaryTree {
    Node root;
    private class Node{
        int value;
        Node left;
        Node right;
    }

    public void add(int value){
        Node node = new Node();
        node.value = value;

        if(root == null){
            root = node;
        }else{
            Node cur = root;
            while(cur != null){
                if(value < cur.value) {
                    if(cur.left == null){
                        cur.left = node;
                        break;
                    }
                    cur = cur.left;
                }
                else {
                    if(cur.right == null){
                        cur.right = node;
                        break;
                    }
                    cur = cur.right;
                }
            }
        }
    }
    public boolean find(int value){
        if(root != null){
            Node cur = root;
            while(cur != null){
                if(cur.value == value)
                    return true;
                if(value < cur.value) {
                    cur = cur.left;
                }
                else {
                    cur = cur.right;
                }
            }
        }
        return false;
    }
}

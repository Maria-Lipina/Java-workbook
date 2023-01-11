package example.OneClassTasks;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //Осторожно: этот конструктор и сеттеры я добавляла уже от себя, на литкоде этого нет и при решении задач может не помочь!
    public TreeNode(int val, TreeNode leftOrRight) {
        this.val = val;
        if (leftOrRight.val < this.val) this.left = leftOrRight;
        else this.right = leftOrRight;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        if (left.val <= this.val) this.left = left;
    }

    public void setRight(TreeNode right) {
        if (right.val >= this.val) this.right = right;
    }

    /**
     * @return строка, отображающая содержание дерева в префиксной записи (левая ветвь и потомки, потом правая ветвь и потомки)
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(val);
        sb.append("(");
        if (left == null) sb.append("null, ");
        else {
            sb.append(left);
            sb.append(", ");
        }
        if (right == null) sb.append("null) ");
        else {
            sb.append(right);
            sb.append(")");
        }
        return sb.toString();
    }

    //https://leetcode.com/problems/same-tree/
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val)&& isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     *<a href="https://leetcode.com/problems/symmetric-tree/description/">текст задачи</a>
     * @param root бинарное дерево, которое необходимо проверить
     * @return true, если левая и правая часть дерева повторяют друг друга, как в зеркале.
     */
    public static boolean isSymmetric(TreeNode root) {
        return (root == null) || isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric (TreeNode left, TreeNode right) {
        if (right == null && left == null) return true;
        if (right != null && left != null) return (left.val == right.val)&& isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        return false;
    }

    /*
    Мне оно потом ещё понадобится, потому что в курсе алгоритмов начнутся деревья
    https://habr.com/ru/post/267855/
    https://javarush.com/groups/posts/3111-strukturih-dannihkh-dvoichnoe-derevo-v-java
    https://studfile.net/preview/7833811/page:33/

     */
}

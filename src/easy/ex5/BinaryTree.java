package easy.ex5;

public class BinaryTree {
    private int head;
    private BinaryTree left;
    private BinaryTree right;
    private int count;

    public BinaryTree(int value) {
        this.head = value;
    }

    public int getValue() {
        return head;
    }

    public void setValue(int value) {
        this.head = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = new BinaryTree(left);
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = new BinaryTree(right);
    }

    private int findLeaves(BinaryTree tree){
        if (tree.getLeft() != null){
            this.findLeaves(tree.getLeft());
        }

        if (tree.getRight() != null){
            this.findLeaves(tree.getRight());
        }

        if (tree.getLeft() == null && tree.getRight() == null) {
            count += 1;
        }

        return count;
    }

    public int numberOfLeaves(BinaryTree tree){
        this.count = 0;
        return findLeaves(tree);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "value=" + head +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

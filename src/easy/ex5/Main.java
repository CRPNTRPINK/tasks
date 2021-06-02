package easy.ex5;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(50);
        binaryTree.setLeft(10);
        binaryTree.setRight(60);
        binaryTree.getLeft().setLeft(5);
        binaryTree.getLeft().getLeft().setRight(7);
        binaryTree.getLeft().getLeft().setLeft(2);
        binaryTree.getRight().setRight(100);
        binaryTree.getRight().setLeft(55);
        // 5.	Данные хранятся в структуре в виде дерева.
        // Напишите метод, подсчитывающий количество «листьев» (конечных элементов) в дереве
        System.out.println(binaryTree.numberOfLeaves(binaryTree));
    }
}

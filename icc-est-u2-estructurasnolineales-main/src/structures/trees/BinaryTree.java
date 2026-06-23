package trees;
import node.Node;
public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;
    private int size = 0; 

    public BinaryTree() { 
        this.root = null;
    }

    public void insert(T value) {
        root = insertRecursivo(root, new Node<T>(value));
        size++; 
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) return nodeInsertar;

        
        if (nodeInsertar.getValue().compareTo(actual.getValue()) < 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public int getPeso() {
        return this.size; 
    }

    public int getAltura() {
        return heightRecursivo(root);
    }

    private int heightRecursivo(Node<T> actual) {
        if (actual == null) return -1;
        return Math.max(heightRecursivo(actual.getLeft()), heightRecursivo(actual.getRight())) + 1;
    }

    
}
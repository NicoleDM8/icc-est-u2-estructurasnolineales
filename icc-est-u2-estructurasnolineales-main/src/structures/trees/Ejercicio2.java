package trees;

import node.Node;

public class Ejercicio2 {
    
    public Node<Integer> invert(Node<Integer> root) {
        invertRecursively(root);
        return root; 
    }
    
    private void invertRecursively(Node<Integer> root) {
        if (root == null) {
            return;
        }
        
        // Intercambiar los hijos izquierdo y derecho
        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
        
        // Hacer lo mismo para los subárboles de manera recursiva
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }
}
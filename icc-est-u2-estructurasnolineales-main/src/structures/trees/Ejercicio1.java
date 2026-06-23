package trees;
import node.Node;

public class Ejercicio1 {

    private Node<Integer> root;

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimir el árbol:");
        printTreeRecursivo(root, 0);
    }

    public void printTree() {
        System.out.println("Imprimir el árbol:");
        printTreeRecursivo(this.root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        System.out.println(actual.getValue());

        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }

    public void insert(int[] numeros) {
        for (int numero : numeros) {
            insertarIndividual(numero);
        }
    }

    private void insertarIndividual(int numero) {
        Node<Integer> nuevoNodo = new Node<>(numero);
        if (root == null) {
            root = nuevoNodo;
            return;
        }

        Node<Integer> actual = root;
        Node<Integer> padre;

        while (true) {
            padre = actual;
            if (numero < actual.getValue()) { // Va a la izquierda
                actual = actual.getLeft();
                if (actual == null) {
                    padre.setLeft(nuevoNodo);
                    return;
                }
            } else { // Va a la derecha
                actual = actual.getRight();
                if (actual == null) {
                    padre.setRight(nuevoNodo);
                    return;
                }
            }
        }
    }

    public Node<Integer> getRoot() {
        return root;
    }
}
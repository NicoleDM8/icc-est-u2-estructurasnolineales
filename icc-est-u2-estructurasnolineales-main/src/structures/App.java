import trees.Ejercicio1;
import trees.Ejercicio2; 
import trees.IntTree;
import models.Person;
import node.Node; 

public class App {
    public static void main(String[] args) throws Exception {

        runIntTree();

        System.out.println("--- Pruebas con Objetos Person ---");

        Person persona1 = new Person("Alice", 30);
        Person persona2 = new Person("Bob", 25);

        Node<Person> nodo1 = new Node<>(persona1);
        Node<Person> nodo2 = new Node<>(persona2);

        nodo1.setLeft(nodo2);

        System.out.println("Nodo Principal: " + nodo1.getValue());
        System.out.println("Hijo Izquierdo del Nodo: " + nodo1.getLeft().getValue());
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Tus números activos: {5, 3, 7, 2, 4, 6, 8}
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(7);
        arbolNumeros.insert(2);
        arbolNumeros.insert(4);
        arbolNumeros.insert(6);
        arbolNumeros.insert(8);

        System.out.println("--- RECORRIDO PRE-ORDER ---");
        arbolNumeros.preOrder();

        System.out.println("--- RECORRIDO POST-ORDER ---");
        arbolNumeros.posOrder();

        System.out.println("--- RECORRIDO IN-ORDER ---");
        arbolNumeros.inOrder();

        System.out.println("--- RECORRIDO POR NIVELES ---");
        arbolNumeros.imprimirPorNiveles();

        System.out.println("--- ALTURA DEL ARBOL ---");
        System.out.println("Altura: " + arbolNumeros.getAltura());

        System.out.println("\n--- EJERCICIO 1: IMPRIMIR ARBOL ORIGINAL ---");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.printTree(arbolNumeros.getRoot());

        System.out.println("\n--- EJERCICIO 2: INVERTIR ARBOL (ESPEJO) ---");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invert(arbolNumeros.getRoot()); // Invierte los nodos internamente
        
        System.out.println("Árbol invertido exitosamente.");
        System.out.println("\n--- IMPRIMIR ARBOL INVERTIDO ---");
        ejercicio1.printTree(arbolNumeros.getRoot()); // Lo mostramos de nuevo para ver el cambio
    } 
}
# UNIVERSIDAD POLITECNICA SALESIANA 

## Estructuras no lineales

## Datos del estudiante

## Nombre: Nicole Estefania Domínguez Muñoz
## Curso: Estructura de Datos G2
## Fecha: 22 de junio del 2026

## Actividad: icc-est-u2-Estructurasnolineales

## DESCRIPCIÓN

En esta actividad implementé y manipulé un Árbol Binario de Búsqueda (BST) en Java, estructurando el proyecto de forma modular. Lo que hice en cada componente fue lo siguiente:

* App.java (Controlador): Diseñé el flujo principal en el método runIntTree() para insertar los números {5, 3, 7, 2, 4, 6, 8}, ejecutar los recorridos (Pre-Order, Post-Order, In-Order, Niveles) y coordinar las pruebas de impresión e inversión. También añadí una prueba genérica con objetos Person.
* Node.java (Nodo Genérico): Creé la estructura base reutilizable <T> con sus punteros left y right para enlazar los hijos, aplicando Getters, Setters y un formato claro en el toString().
* BinaryTree.java (Lógica Base): Programé las reglas de inserción ordenada utilizando genéricos acotados (Comparable) y desarrollé el método recursivo para calcular la altura del árbol.
* Person.java (Modelo): Definí una entidad simple (nombre y edad) para demostrar que los nodos pueden almacenar objetos complejos.
* Ejercicio1.java (Visualización): Implementé la carga masiva mediante un arreglo y desarrollé un algoritmo recursivo que imprime el árbol de forma gráfica y lateral en la consola usando tabulaciones por niveles.
* Ejercicio2.java (Inversión Espejo): Programé una función recursiva que realiza un intercambio (swap) de los hijos izquierdo y derecho en cada nodo, logrando voltear el árbol por completo como un espejo.


## RESULTADOS OBTENIDOS EN CONSOLA
![alt text](bin/image.png)

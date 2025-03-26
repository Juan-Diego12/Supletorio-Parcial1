package co.edu.uniquindio.poo.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        GestorTareas<String> gestor = new GestorTareas<>();
        gestor.agregarTarea("Tarea 1: Rezar para el examen");
        gestor.agregarTarea("Tarea 2: Consultar el manual de la calculadora");
        gestor.agregarTarea("Tarea 3: Estudiar para el parcial de estadística");
        gestor.iterator().forEachRemaining(System.out::println);
    }
}
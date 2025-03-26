package co.edu.uniquindio.poo.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        almacen.agregarProducto(new Producto("Laptop Asus plus gaming edition", 5, 2000000));
        almacen.agregarProducto(new Producto("GForce RTX 3080", 1, 2700000));
        almacen.agregarProducto(new Producto("Mouse Logitech MX Master 3", 1, 100000));
        almacen.agregarProducto(new Producto("Monitor Dell U2719H", 1, 2000000));
        System.out.println("Productos ordenados por nombre:");
        almacen.iterator().forEachRemaining(System.out::println);
        almacen.ordenarPorPrecio();
        almacen.iterator().forEachRemaining(System.out::println);
    }
}
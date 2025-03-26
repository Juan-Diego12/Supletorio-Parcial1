package co.edu.uniquindio.poo.Ejercicio1;
import java.util.*;
class Almacen<T extends Producto> implements Iterable<T> {
    private TreeSet<T> productos;
    private Comparator<T> comparadorPorPrecio = Comparator.comparingDouble(T::getPrecio);
    public Almacen() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }


    public void ordenarPorPrecio() {
        TreeSet<T> ordenadosPorPrecio = new TreeSet<>(comparadorPorPrecio);
        ordenadosPorPrecio.addAll(productos);
        productos = ordenadosPorPrecio;
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }
}
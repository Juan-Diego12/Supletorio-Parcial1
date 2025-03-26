package co.edu.uniquindio.poo.Ejercicio2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class GestorTareas<T> implements Iterable<T> {
    private List<T> tareas;

    public GestorTareas() {
        this.tareas = new LinkedList<>();
    }
    public void agregarTarea(T tarea) {
        tareas.add(tarea); 
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorInverso<>(tareas);
    }
    private static class IteradorInverso<T> implements Iterator<T> {
        private final ListIterator<T> iterador;

        public IteradorInverso(List<T> lista) {
            this.iterador = lista.listIterator(lista.size());
        }

        @Override
        public boolean hasNext() {
            return iterador.hasPrevious();
        }

        @Override
        public T next() {
            return iterador.previous();
        }
    }
}

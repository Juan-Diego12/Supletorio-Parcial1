package co.edu.uniquindio.Ejercicio3;
import java.util.Arrays;
public class Combinaciones {
    
    public static void generarCombinaciones(int n) {
        int[] resultado = new int[n];
        generarCombinacionesRecursivo(n, 0, resultado);
    }

    private static void generarCombinacionesRecursivo(int n, int indice, int[] resultado) {
        if (indice == n) { 
            System.out.println(Arrays.toString(resultado));
            return;
        }
        for (int i = 1; i <= 2; i++) {
            resultado[indice] = i;
            generarCombinacionesRecursivo(n, indice + 1, resultado);
        }
    }

    public static void main(String[] args) {
        int n = 2; 
        System.out.println("Todas las combinaciones posibles de " + n + " dados:");
        generarCombinaciones(n);
    }
}

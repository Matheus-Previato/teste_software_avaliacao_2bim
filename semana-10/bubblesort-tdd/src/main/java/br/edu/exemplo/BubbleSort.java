package br.edu.exemplo;

public class BubbleSort {

    private final int[] numeros;

    public BubbleSort(int[] numeros) {
        this.numeros = numeros;
    }

    public void ordenar() {
        for (int limite = numeros.length - 1; limite > 0; limite--) {
            for (int indice = 0; indice < limite; indice++) {
                if (numeros[indice] > numeros[indice + 1]) {
                    int anterior = numeros[indice];
                    numeros[indice] = numeros[indice + 1];
                    numeros[indice + 1] = anterior;
                }
            }
        }
    }

    public int[] getNumeros() {
        return numeros;
    }
}

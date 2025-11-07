/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_arreglos_metodos;

/**
 *
 * @author OMARABIUD
 */
public class EVA3_5_ARREGLOS_METODOS {

    public static void main(String[] args) {
        int[] miArreglo;
        miArreglo = crearArreglo(10, 100);
        imprimirArreglo(miArreglo);
    }
    //crear un arreglo y lo devuelva lleno de valores aleatorios
    public static int[] crearArreglo(int tama, int valorAleatorio){
        int resu[] = new int[tama];
        for (int i = 0; i < resu.length; i++) {
            resu[i] = (int)(Math.random() * valorAleatorio);
        }
        return resu;
    }
    //imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}

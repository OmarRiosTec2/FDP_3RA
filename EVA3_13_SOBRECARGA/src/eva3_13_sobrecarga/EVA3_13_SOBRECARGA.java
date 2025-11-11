/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecarga;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA3_13_SOBRECARGA {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String resu;
        resu = capturar("Introduce el nombre: ");
        System.out.println(resu);
        double valor;
        valor = capturar("Salario del empleado: ",0.0);
        System.out.println(valor);
        int edad;
        edad = capturar("Edad del empleado: ", 1);
        System.out.println(edad);
    }
    public static String capturar(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextLine();
    }
    public static double capturar(String mensaje, double dummy){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextDouble();
    }
    public static int capturar(String mensaje, int dummy){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextInt();
    }
}

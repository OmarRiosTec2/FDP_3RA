/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA3_4_TEMPERATURA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do{
            imprimirMenu();
            valor = captu.nextInt();
            //manejo de opciones --> switch
            switch(valor){
                case 1:
                    System.out.println("**Grados fahrenheit** ");
                    realizarFahr();
                    break;
                case 2:
                    System.out.println("***Grados kelvin:***");
                    realizarKev();
                    break;
                case 3:
                    System.out.println("***Grados kev/fahr:***");
                    realizarFahr2();
                    break;
            }
        }while(valor != 4);
        
        
        
        
        
        
        
        
        }
        public static void imprimirMenu(){
        System.out.println("BIENVENIDO");
        System.out.println("Elige de las siguientes opciones: ");
        System.out.println("1. Calcular grados fahr a celc");
        System.out.println("2. Calcular grados kev a celc");
        System.out.println("3. Calcular grados kev a fahr");
        System.out.println("4. Terminar");
        }
        
        public static void realizarFahr(){
        Scanner captu = new Scanner(System.in);
        double fahr;
        System.out.println("Grado fahrenheit: ");
        fahr = captu.nextDouble();
        double resu = convertirFarCelcius(fahr);
        System.out.println(fahr + "ºFahrenheit = " + resu + "ºC");
    }
    
    
    public static double convertirFarCelcius(double fahr){
        double resu = (fahr - 32) / 1.8;
        return resu;
    }
    public static void realizarKev(){
        Scanner captu = new Scanner(System.in);
        double Kev;
        System.out.println("Grado Kelvin: ");
        Kev = captu.nextDouble();
        double resu = convertirKevCelcius(Kev);
        System.out.println(Kev + "ºKelvin = " + resu + "ºC");
    }
    public static double convertirKevCelcius(double kev){
        double resu = kev - 273;
        return resu;
    }    
    public static void realizarFahr2(){
        Scanner captu = new Scanner(System.in);
        double fahr2;
        System.out.println("Grado Fahrenheit: ");
        fahr2 = captu.nextDouble();
        double resu = convertirKevFahrenheit(fahr2);
        System.out.println(fahr2 + "Fahrenheit = " + resu + "ºK");
    }
    public static double convertirKevFahrenheit(double fahr2){
        double resu = (1.8 / fahr2 - 273) + 32;
        return resu;
    }
}

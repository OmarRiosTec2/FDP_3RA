/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_1_metodos;

/**
 *
 * @author OMARABIUD
 */
public class EVA_3_1_METODOS {
    //
    public static void main(String[] args) {
        //INVOCAR EL MÉTODO
        //LLAMADA A PROCEDIMIENTO O FUNCIÓN
        //1. Si queremos recuperar el valor
        int resu = calcularCuadrado(100);
        System.out.println("El cuadrado de 100 es " + resu);
    }
    //MODIFICADORES
    //MODIFICADOR DE ACCESO: public, private, protected, default
    //static --> se necesita para usar nuestros metodos en el main
    //public static
                    //VALOR DE RETORNO (tipo de dato)
                        //NOMBRE DE MÉTODO (USAR VERBO)
                            //(LISTA DE PARAMETROS)
                                   //CERO O N CANTIDAD
    public static int calcularCuadrado(int num){ //ENCABEZADO(HEADER)
        //{} --> IMPLEMENTACIÓN DEL METODO (CUERPO DEL MÉTODO)
        int cuadrado = num * num;
        return cuadrado; //regresamos el resutado
        //ya no se puede poner codigos aqui
        
 }
} 
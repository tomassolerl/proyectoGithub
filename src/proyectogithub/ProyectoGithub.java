/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogithub;

/**
 *
 * @author usuario
 */
public class ProyectoGithub {

    public static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }
    public static void main(String[] args) {
        System.out.println("La calificación de " + args[0] + ": ");
        System.out.println(veredicto(args[1],args[2]));
    }
    
}

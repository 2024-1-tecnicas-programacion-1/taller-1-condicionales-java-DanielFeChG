
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielchavez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
        double imc = peso/Math.pow(estatura,2);
        String riesgo="";
        if(edad<45){
            if(imc<22.0){
                riesgo="bajo";
            }
            else{
                riesgo="medio";
            }
        }
        else if (edad>=45){
            if(imc<22.0){
                riesgo="medio";
            }
            else{
                riesgo="alto";
            }
        }
        return(riesgo);
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}

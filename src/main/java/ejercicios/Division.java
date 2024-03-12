
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int dividendo, int divisor) {
        // TODO: Coloca aquí el código del ejercicio 3: Division
        String respuesta ="";
        if(divisor==0){
            respuesta = "No se puede dividir entre 0";
        }
        else{
            int residuo =  dividendo % divisor;
            int cociente = dividendo/divisor;
            String exactitud = "";
            if (residuo == 0){
                exactitud = "es exacta. ";
            }
            else{
                exactitud = "no es exacta. ";
            }
            respuesta = "La división "+ exactitud 
                + "\nCociente: " + cociente + "\n"
                + "Residuo: " + residuo;
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}

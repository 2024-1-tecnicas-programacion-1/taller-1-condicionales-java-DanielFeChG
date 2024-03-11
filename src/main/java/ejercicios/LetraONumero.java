
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        String respuesta="";
        if (caracter >=48 && caracter<=57){
            respuesta="Es número";
        }
        else if(caracter >=97 && caracter<=122){
            respuesta="Es letra minúscula";
        }
        else if(caracter >=65 && caracter<=90){
            respuesta="Es letra mayúscula";
        }
        else{
            respuesta="No es letra ni número";
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}

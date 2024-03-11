package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        String resultado = "";
        if ((numVictoriasA >= 6 || numVictoriasB >= 6)&&(numVictoriasA > numVictoriasB +1 || numVictoriasB > numVictoriasA +1)){
                if (numVictoriasA+2 < numVictoriasB || numVictoriasB+2 < numVictoriasA || (numVictoriasA>7 || numVictoriasB>7)){
                resultado= "Inválido";
                }
                else if (numVictoriasA>numVictoriasB){
                    resultado = "Ganó A";
                }
                else{
                    resultado = "Ganó B";
                }
        }
        else{
            if(numVictoriasA == 7 && numVictoriasB==6){
                resultado = "Ganó A";
            }
            else if(numVictoriasA == 6 && numVictoriasB==7){
                resultado = "Ganó B";
            }
            else{
                resultado="Aún no termina";
            }
        }
        return (resultado);
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}

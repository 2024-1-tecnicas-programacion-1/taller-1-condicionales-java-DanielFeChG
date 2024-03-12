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
        int mayor = 0;
        int menor =0;
        String ganador ="";
        
        if(numVictoriasA>numVictoriasB){
            mayor = numVictoriasA;
            menor = numVictoriasB;
            ganador = "A";
        }
        else{
            mayor = numVictoriasB;
            menor = numVictoriasA;
            ganador = "B";
        }
        
        if(mayor == 6 && mayor - menor ==2 ){
            resultado = "Ganó " + ganador;
        } 
        else if (mayor == 7 && (menor == 6 || menor == 5 )){
            resultado = "Ganó " + ganador;
        }
        else if (mayor < 7 && mayor-menor != 2){
            resultado = "Aún no termina";
        }
        else{
            resultado = "Inválido";
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

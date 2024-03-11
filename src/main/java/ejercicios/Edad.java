package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno){
        // TODO: Coloca aquí el código del ejercicio 6: Edad
        LocalDate currentDate = LocalDate.now();
        int dia_actual = currentDate.getDayOfMonth();
        int mes_actual = currentDate.getMonthValue();
        int anno_actual = currentDate.getYear();
        int edad = anno_actual - anno;
        
        
        //String fecha_actual = String.valueOf(anno_actual) + "-" + String.valueOf(mes_actual + "-" + str + String.valueOf(dia_actual));
//        String fecha_nacimiento = String.valueOf(anno) + "-" + String.valueOf(mes + "-" + String.valueOf(dia));
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         
//        LocalDate fechaA = LocalDate.parse(fecha_actual, formatter);
//        LocalDate fechaN = LocalDate.parse(fecha_nacimiento, formatter);
        
        String respuesta = "";
//        if (fechaN.isBefore(fechaA)){
//            respuesta = "Fecha de nacimiento inválida";
//        }
//        else{
            if(mes_actual<=mes && dia_actual<dia){
                edad -= 1;
            }
            respuesta = "Usted tiene " + String.valueOf(edad) + " años";
//        } 
        
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}

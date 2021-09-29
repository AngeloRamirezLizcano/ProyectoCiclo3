package cobro_tiempo;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Cobro_tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definición de variables
        int tipo_vehiculo;
        LocalDateTime hora_entrada = LocalDateTime.now();
        LocalDateTime hora_salida = LocalDateTime.of(2021, Month.SEPTEMBER, 20, 16, 10);
        
        //Creación objeto para dar formato a la hora
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        //Creación objeto scanner
        Scanner sc = new Scanner(System.in);
        //Do while par generar cobro mediante menú
        do {
            System.out.println("-----------------------------");
            System.out.println("Menú de cobro");
            System.out.println("-----------------------------");
            System.out.println("Elija una opcion: ");
            System.out.println("1.Motocicleta");
            System.out.println("2.Automovil");
            System.out.println("3.Bicicleta");
            System.out.println("4.Salir");
            tipo_vehiculo = sc.nextInt();

            if (tipo_vehiculo == 1) {
                int total_tiempo = (int) ChronoUnit.MINUTES.between(hora_entrada, hora_salida);
                int total_pagar = total_tiempo * 30;
                System.out.println("Hora de entrada: " + hora_entrada.format(formato));
                System.out.println("Hora de salida: " + hora_salida.format(formato));
                
                System.out.println("-------------------------");
                System.out.println("El tiempo de permanencia dentro de las instalaciones ha sido de " + total_tiempo + " Minutos");
                System.out.println("-------------------------");
                System.out.println("Total a pagar: " + " $"+total_pagar);

            }
            if (tipo_vehiculo == 2) {
                int total_tiempo = (int) ChronoUnit.MINUTES.between(hora_entrada, hora_salida);
                int total_pagar = total_tiempo * 45;
                System.out.println("Hora de entrada: " + hora_entrada.format(formato));
                System.out.println("Hora de salida: " + hora_salida.format(formato));
                
                System.out.println("-------------------------");
                System.out.println("El tiempo de permanencia dentro de las instalaciones ha sido de " + total_tiempo+" Minutos");
                System.out.println("-------------------------");
                System.out.println("Total a pagar: " + " $"+total_pagar);

            }
            if (tipo_vehiculo == 3) {
                int total_tiempo = (int) ChronoUnit.MINUTES.between(hora_entrada, hora_salida);
                int total_pagar = total_tiempo * 10;
                System.out.println("Hora de entrada: " + hora_entrada.format(formato));
                System.out.println("Hora de salida: " + hora_salida.format(formato));
                
                System.out.println("-------------------------");
                System.out.println("El tiempo de permanencia dentro de las instalaciones ha sido de " + total_tiempo + " Minutos");
                System.out.println("-------------------------");
                System.out.println("Total a pagar: " + " $"+total_pagar);

            }
            
          
        } while (tipo_vehiculo != 4);

      

    }

}

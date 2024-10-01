package parte2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		//Declaramos la variable segundos totales usada para calcular los segundos finales
		int segundostotales;
		//Declaramos la variable horas que usaremos para el calculo final de las horas
		int horas;
		//Creamos la variable minutos para el calculo final de los minutos
		int minutos;
		//Creamos la variable segundos usada para el calculo final de los segundos
		int segundos;
		  // Solicitar al usuario que introduzca una cantidad de segundos
        System.out.print("Introduce una cantidad de segundos: ");
        //Creacion scanner
        Scanner lectura=new Scanner(System.in);
		 segundostotales = lectura.nextInt();
        /* Calculadora de horas, minutos y segundos*/
       horas = segundostotales / 3600;
       minutos = (segundostotales % 3600) / 60;
        segundos = segundostotales % 60;
        // Muestra el resultado final
        System.out.println(segundostotales + " segundos son " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        //Cierre Scanner
        lectura.close(); 
	}

}

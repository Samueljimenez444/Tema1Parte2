package parte2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		//Creamos la variable numero que actua como numero que introduce el usuario
		double numero;
		//Creamos la variable redondeado que sirve para redondear el numero introducido
        int redondeado;
        // Creamos el Scanner
        Scanner lectura=new Scanner(System.in);
        /*Damos el valor a las variables en base al input del usuario y en base a unas operaciones aritmeticas*/
		numero= lectura.nextDouble();
        redondeado = (int) (numero + 0.5);
        //Print del resultado
        System.out.println("Número redondeado: " + redondeado);
   //Cierre Scanner
lectura.close();
	
	
	}

}

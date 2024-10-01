package parte2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	
		//Creamos la variable numero usada como referencia para el calculo
	    int numero;
		//Creamos la variable numero2 usada como referencia para la suma de numeros que necesitamos
	    int numero2;
		//Creamos la variable resto que actuara como el resto del calculo
	    int resto;
		//Creamos la variable total que calculara la expresion final 
	    int total;
	    //Creamos el Scanner
		Scanner lectura= new Scanner(System.in);
		/*Definimos las variables en base a los inputs del usuario, operaciones matematicas y el operador logico "?"*/
		numero= lectura.nextInt();
		numero2= lectura.nextInt();
		resto= numero%numero2;
		total= resto==0 ? 0:numero2-resto;
		//Print del resultado
		System.out.println("Deberas sumarle a el numero"+ " "+ total +" " + "para que sea multiplo de" + " " + numero2);
		//Cierre Scanner
		lectura.close();
	}

}

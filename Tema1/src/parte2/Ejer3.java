package parte2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	
		/*Creamos las variables*/
	    int numero;
	    int numero2;
	    int resto;
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

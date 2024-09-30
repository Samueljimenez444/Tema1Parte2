package parte2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		/*Creamos las variables*/
    int numero;
    int resto;
    int total;
    //Creamos el Scanner
	Scanner lectura= new Scanner(System.in);
	/*Definimos las variables en base a los inputs del usuario, operaciones matematicas y el operador logico "?"*/
	numero= lectura.nextInt();
	resto= numero%7;
	total= resto==0 ? 0:7-resto;
	//Print del resultado
	System.out.println("Deberas sumarle el numero" +" "+ total +" " + "para que sea multiplo de 7");
	//Cierre Scanner
	lectura.close();
	}

}

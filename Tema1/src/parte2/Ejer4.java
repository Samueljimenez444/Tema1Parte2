package parte2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		//Creamos la variable a para calcular la expresion
		int a;
		//Creamos la variable b para calcular la expresion
		int b;
		//Creamos la variable c para calcular la expresion
		int c;
		//Creamos la variable x para calcular la expresion
		int x;
		//Creamos la variable total para calcular el resultado final
		int total;
		//Creamos el Scanner
		Scanner lectura= new Scanner(System.in);
		/*Definimos las variables*/
		a= lectura.nextInt();
	    b=lectura.nextInt();
	    c=lectura.nextInt();
	    x=lectura.nextInt();
		total= (a*(x*x))+(b*x)+(c);
		//Print del resultado total
System.out.println(total);
//Ciere Scanner
lectura.close();
	}

}

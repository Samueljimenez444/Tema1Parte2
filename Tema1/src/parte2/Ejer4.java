package parte2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/*Creamos las variables*/
		int a;
		int b;
		int c;
		int x;
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

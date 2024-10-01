package parte2;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		//Declaramos la variable metro
		double metros;
		//Declaramos la variable centimetros
		double centimetros;
		//Declaramos la variable milimetros
		double milimetros;
		//Creacion del scanner
		Scanner lectura=new Scanner(System.in);
		/*Declaracion de los valores de las variables en base al input del usuario y prints que le indican que hacer*/
		System.out.println("Introduzca la medida en metros");
		metros=lectura.nextInt();
		System.out.println("Introduzca la medida en centimetros");
		centimetros=lectura.nextInt();
		System.out.println("Introduzca la medida en milimetros");
		milimetros=lectura.nextInt();
		//Calculo aritmetico necesario para poder calcular la longitud total en cm
double total= (metros*100)+centimetros+(milimetros/10);
//Print con el resultado total
System.out.println("En total la longitud introducida a sido de" + " " + total+ " "+ "centimetros");
//Cierre Scanner
lectura.close();
	}

}

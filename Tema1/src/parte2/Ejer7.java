package parte2;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		/*Declaramos la variable entradan que registrara la entrada para niños*/
	int entradan;
	/*Declaramos la variable entradan que registrara la entrada para adultos*/
	int entradaadulto;
	/*Declaramos las constantes para los precios de las entradas de niño y adulto*/
	final double precion=15.5;
	final double precioadulto=20;
	/*Creamos dos variables para el calculo final del precio*/
	double total;
	double total2;
	/*Creamos el Scanner y printeamos las instrucciones para el usuario*/
	Scanner lectura=new Scanner(System.in);
	System.out.println("Introduzca las entrdas para niños");
	/*Le damos a las variables el valor que le introduzca el usuario al scanner*/
	entradan= lectura.nextInt();
	System.out.println("Introduzca las entradas para adultos");
    entradaadulto= lectura.nextInt();
    /*Creamos los calculos para calcular el precio total de las entradas*/
    total = (entradan*precion)+(entradaadulto*precioadulto);
    total2= total>100 ? total-((total*5)/100):total;
    /*Print del calculo final*/
    System.out.println("El precio total es de"+" "+total2+" "+"euros");
    //Cierre Scanner
	lectura.close();
	}

}

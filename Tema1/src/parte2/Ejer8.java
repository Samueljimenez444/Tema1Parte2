package parte2;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		//Declaramos la variable lanzamiento que nos servira como dato inicial
	double lanzamiento;
	//Creamos la variable conversion con la que convertiremos los metros en centimetros
	double conversion;
	//Creamos la variable conversion2 que servira para truncar el resultado
    int conversion2;
    //Creamos el Scanner
	Scanner lectura=new Scanner(System.in);
	/*Calculos aritmeticos y lectura del input para calcular el resultado final del lanzamiento*/
	lanzamiento=lectura.nextDouble();
	conversion= lanzamiento*100;
	conversion2=(int) (conversion);
	//Print del resultado final
	System.out.println("La longitud total en centimetros del lanzamiento es de"+" " +conversion2+ " " + "centimetros");
	//Cierre Scanner
    lectura.close();
	}

}

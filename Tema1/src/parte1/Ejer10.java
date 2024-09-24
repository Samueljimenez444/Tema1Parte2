package parte1;
import java.util.Scanner;
public class Ejer10 {

	public static void main(String[] args) {
		/*1ºCreamos las variables*/
 int numero;
/*2ºCreamos el escaner*/
Scanner lectura= new Scanner(System.in);
/*3ºCreamos el print con las instrucciones para el usuario*/
System.out.println("Introduzca un numero y el programa analizara si es par o impar");
/*4ºDefinimos las variables y creamos el if donde si un numero dividido entre 2 da un resto!= que 0 el programa indicara que este es impar. Si el resto es igual a cero el programa indicara que es par*/
numero=lectura.nextInt();
if (numero%2 !=0)
	 System.out.println("El numero es impar");
else
	 System.out.println("El numero es par");
lectura.close();

	}

}

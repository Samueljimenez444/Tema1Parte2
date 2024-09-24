package parte1;
import java.util.Scanner;
public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1ºDefinimos la variable*/
 int edad;
 /*2ºCreamos el scanner*/
 Scanner lectura= new Scanner(System.in);
 /*3ºInput que le indica a el usuario la accion que debe realizar*/
 System.out.println("Introduce tu edad");
 /*4ºDefinimos la variable en base a el input del usuario*/
 edad=lectura.nextInt();
 /*5º Creamos un if donde a las personas que introduzcan una edad igual o mayor a 18 recibiran un mensaje donde se les indicara que son menores de edad. Si lo son seran llevados por el else que les llevara a la otra frase*/
 if (edad<18)
	 System.out.println("Usted es menor de edad");
 else
	 System.out.println("Usted es mayor de edad");
 /*6ºCerramos el escaner*/
 lectura.close();
	}

}

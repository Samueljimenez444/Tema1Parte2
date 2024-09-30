package parte2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*Creamos las variables*/
	int tiempo;
	int totalm;
	int totalh;
	//Creamos el Scanner
	Scanner lectura=new Scanner(System.in);
	/*Definimos las variables*/
	tiempo= lectura.nextInt();
	totalm= tiempo/60;
	totalh=totalm/60;
	//Print del resultado
	System.out.println("En total hay" + " " +totalh + " " +"horas"+ " " +totalm +" "+"minutos y"+ " "+ tiempo +" "+ "segundos");
	//Cierre Scanner
	lectura.close();
	}

}

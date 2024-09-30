package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
final int iva=21;
int precio;
int precio2;
double total;
Scanner lectura=new Scanner(System.in);
precio=lectura.nextInt();
precio2= (precio*21)/100;
total= precio+precio2;
System.out.println("El precio total es de" + " " +(double) total + " " + "euros");
	}

}

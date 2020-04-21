//Importación Scanner
import java.util.Scanner;

//Creamos la clase principal
class Hexadecimal{
	public static void main(String args[]){
		//Creamos un objeto 
		Scanner t=new Scanner(System.in);
	
		//Declaramos la variabl
		//Lectura del valor
		System.out.print("Ingrese un numero hexadecimal: ");
		String hex=t.nextLine(); 

		//Imprimimos en pantalla el numero hexadecimal
		System.out.print("El numero "+hex+" a binario es: "+Integer.toBinaryString((Integer.parseInt(hex, 16))));

}
}
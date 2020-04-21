import java.util.Scanner;

class Hexadecimal{

	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
	
		System.out.print("Ingrese un numero hexadecimal: ");
		String hex=t.nextLine(); 

		System.out.print("El numero "+hex+" a binario es: "+Integer.toBinaryString((Integer.parseInt(hex, 16))));

}
}
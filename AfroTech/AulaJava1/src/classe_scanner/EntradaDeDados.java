package classe_scanner;

	import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		//float altura ;
		//double area;
		//char tipo ;
		//String palavra ;
		
		System.out.println("\nDigite um valor para a Vari�vel quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a Vari�vel identificador (long): ");
		identificador = leia.nextLong();
		
		
		System.out.println("\nVari�vel quantidade = " + quantidade);
		
		System.out.println("\nVari�vel quantidade = " + identificador);
		
		leia.close();
	
	}

}

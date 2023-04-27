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
		
		System.out.println("\nDigite um valor para a Variável quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a Variável identificador (long): ");
		identificador = leia.nextLong();
		
		
		System.out.println("\nVariável quantidade = " + quantidade);
		
		System.out.println("\nVariável quantidade = " + identificador);
		
		leia.close();
	
	}

}

package estruturaRepeticao;

import java.util.Scanner;
public class Repetica02 {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int resultado, numero, contador = 1;
		
		
		while (contador < 5) {
			System.out.println("Digite o " + contador + "º número:");
			numero = leia.nextInt();

			
			
			resultado = numero * 9;
			
			System.out.println(numero + " x 9 = " + resultado);
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

			contador++;

		}
		
		System.out.println("\t\t_________Fim do problema_________");
	}

}

package estruturaRepeticao;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
		for (contador =1  ; contador < 4; contador++) {
			System.out.println("\nDigite o " + contador + "º nome: ");
			nome = leia.next();
			
			System.out.println("O " + contador + "º nome é: " + nome);
			
		}
		

	}

}

programa
{
	
	funcao inicio()
	{
	// Q2. Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e
	//     que se encontram no conjunto dos números de 1 até 500.
	
		inteiro num,soma=0

		para(num=1;num<=500;num++)
		{
			se(num % 2==1 e num % 3==0)
			{
			soma = soma + num
			}
		}
		
		escreva("\nEsta é a soma total dos números ímpares e múltiplos de 3: ",soma)
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */

//programa
programa
{
	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
	
	funcao inicio()
	{

	//variaveis
	 inteiro anos
	 inteiro meses
	 inteiro dias
	 inteiro totalDias 

	//entradas
	 escreva("Digite o numero de anos :")
	 leia(anos)
	 escreva("Digite o numero de meses :")
	 leia(meses)
	 escreva("Digite o numero de dias :")
	 leia(dias)

	//processamentos
	 totalDias = (anos * 365) + (meses * 30) + dias

	//saídas
	 escreva("Total de dias na terra :"+totalDias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
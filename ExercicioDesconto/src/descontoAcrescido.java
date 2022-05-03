import java.util.Scanner;

public class descontoAcrescido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); /* isso daqui serve só para adicionar a biblioteca read ao código */
		
		/* Aqui eu to criando as variaveis antes de associar valor para elas*/
		double valor;
		int quantidade;
		
		System.out.println("Qual valor do produto que Maria comprou? "); /* serve para imprimir a mensagem na tela */
		valor=leia.nextDouble(); /* captura o valor digitado no console e atribui a variavel valor */
		
		System.out.println("Qual a quantidade de produto Maria comprou?"); /* serve para imprimir a mensagem na tela */
		quantidade=leia.nextInt(); /* captura o valor digitado no console e atribui a variavel valor */
		
		/* Aqui eu to criando um variavel que já vai armazenar o valor total dessa compra para facilitar meu calculo */
		double totalSemDesconto = valor * quantidade;
		
		System.out.println("O total da compra de Maria sem desconto é: " +totalSemDesconto);/* serve para imprimir a mensagem na tela, 
		 																						estou imprimindo o total só pra gente organizar*/
		
		/* Aqui eu vou criar a variavel que vai armazenar meu valor com desconto */
		double totalComDesconto = totalSemDesconto-(totalSemDesconto*0.1); /* ela  vai ter o valor inicial total da compra menos o fixo de 10% */
		
		System.out.println("\n");/* serve só pra pular uma linha. */
		System.out.println("O valor da compra de Maria com desconto fixo é: " + totalComDesconto);/* vai exibir a mensagem de valor da compra */
		
		
		for(int x=0; x < quantidade; x++) {
			/* Vou explicar esse for porque não sei se é igual em Python
			 * int x=0 == estou criando a variavel que vai correr nesse laço
			 * x<quantidade == ela só vai continuar fazendo o calculo enquanto for menor que a quantidade comprada
			 * como ela começa em 0, ela vai rodar a quantidade exata
			 * x++ em cada volta ela vai aumentar um no valor do laço */
			
			totalComDesconto = totalComDesconto-(totalComDesconto*0.01);
			/* Explicando a conta:
			 * Vai receber o valor com desconto fixo de 10% na primeira volta
			 * nas voltas seguintes do laço ela vai usar como base o ultimo valor armazenado da volta anterior
			 * tornando o desconto acumulativo. */
			
			System.out.println("Com desconto é: " + totalComDesconto); /* coloquei para exibir a cada volta do laço pra gente 
																			acompanhar e se certificar que sera igual a quantidade
																			de produto informada */
			
		}
		System.out.println("\n");/* serve só pra pular uma linha. */
		System.out.println("O valor final da compra de Maria é: " + totalComDesconto);/* vai exibir a mensagem de valor final da compra */
		
		/* PS: Não arredondei porque não lembrei como arredondava hahahaha */
		
	}

}

package complementares1;

import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
	
	/*Fazer um programa para calcular o troco no processo de pagamento de um produto de uma 
	 * mercearia. O programa deve ler o preço unitário do produto, a quantidade de unidades
	 * compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja 
	 * dinheiro suficiente). Seu programa deve mostrar o valor do troco a ser devolvido 
	 * ao cliente.
	 */

	Scanner sc = new Scanner(System.in);
	
	float preco, pagamento, troco;
	int unidades;
	
	System.out.println("Insira o preço do produto: ");
	preco = sc.nextFloat();
	System.out.println("Insira quantas unidades do produto: ");
	unidades = sc.nextInt();
	System.out.println("Insira o valor recebido: ");
	pagamento = sc.nextFloat();
	
	troco = pagamento - preco * unidades;
	
	System.out.println("Troco: "+ troco);
	
	sc.close();
	
	}
}

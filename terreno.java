package complementares1;

import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler as medidas da largura e comprimento de um terreno 
		*retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com 
		*duas casas decimais. Em seguida, o programa deve mostrar o valor da �rea do terreno,
		bem como o valor do pre�o do terreno, ambos com duas casas decimais.
		*/

		Scanner sc = new Scanner(System.in);
		
		float largura, comprimento, valor, area, preco;
		
		System.out.println("Entre com a largura do terreno:");
		largura = sc.nextFloat();
		System.out.println("Entre com o comprimento do terreno:");
		comprimento = sc.nextFloat();
		System.out.println("Entre com o valor do metro quadrado do terreno:");
		valor = sc.nextFloat();
		
		area = largura * comprimento;
		preco = area * valor;
		
		System.out.printf("A �rea do terreno �: %.2f%n", area);
		System.out.printf("O pre�o do terreno �: %.2f", preco);
		
	}
}

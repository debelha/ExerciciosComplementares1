package complementares1;

import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro, 
		 * bem como o total de combust�vel gasto por este carro ao percorrer tal dist�ncia. 
		 * Seu programa deve mostrar o consumo m�dio do carro, com tr�s casas decimais.
		 */

		Scanner sc = new Scanner(System.in);
		
		float km, gas, consumo;
		
		System.out.println("Insira quantos km foram rodados");
		km = sc.nextFloat();
		
		System.out.println("Insira quanto combust�vel foi gasto");
		gas = sc.nextFloat();
		
		consumo = km / gas;
		
		System.out.printf("O consumo m�dio � de: %.3f", consumo);
		
		sc.close();
	}

}

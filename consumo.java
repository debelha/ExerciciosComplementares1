package complementares1;

import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler a distância total (em km) percorrida por um carro, 
		 * bem como o total de combustível gasto por este carro ao percorrer tal distância. 
		 * Seu programa deve mostrar o consumo médio do carro, com três casas decimais.
		 */

		Scanner sc = new Scanner(System.in);
		
		float km, gas, consumo;
		
		System.out.println("Insira quantos km foram rodados");
		km = sc.nextFloat();
		
		System.out.println("Insira quanto combustível foi gasto");
		gas = sc.nextFloat();
		
		consumo = km / gas;
		
		System.out.printf("O consumo médio é de: %.3f", consumo);
		
		sc.close();
	}

}

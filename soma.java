package complementares1;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
	//Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela 
	//o valor da soma destes n�meros.

		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		System.out.println("Insira um n�mero");
		x = sc.nextInt();
		System.out.println("Insira outro n�mero");
		y = sc.nextInt();
		
		resultado = x + y;
		
		System.out.printf("O resultado da soma �: "+ resultado);
		
		sc.close();
		
	}
}

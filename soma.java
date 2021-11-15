package complementares1;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
	//Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela 
	//o valor da soma destes números.

		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		System.out.println("Insira um número");
		x = sc.nextInt();
		System.out.println("Insira outro número");
		y = sc.nextInt();
		
		resultado = x + y;
		
		System.out.printf("O resultado da soma é: "+ resultado);
		
		sc.close();
		
	}
}

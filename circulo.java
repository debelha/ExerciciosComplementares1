package complementares1;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar 
		 * o valor da área do círculo com três casas decimais. A fórmula da área do círculo
		 * é a seguinte: area = pi. r .Você pode sar o valor de pi fornecido pela biblioteca 
		 * da sua linguagem de programação, ou então, se preferir, use diretamente o valor.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int raio;
		float area;
		 
		System.out.println("Insira o valor do raio do círculo: ");
		raio = sc.nextInt();
		
		area = (float) (Math.PI * raio * raio);
		
		System.out.printf("A área desse círculo é: %2.3f", area);
	}
}

package complementares1;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler o valor "r" do raio de um c�rculo, e depois mostrar 
		 * o valor da �rea do c�rculo com tr�s casas decimais. A f�rmula da �rea do c�rculo
		 * � a seguinte: area = pi. r .Voc� pode sar o valor de pi fornecido pela biblioteca 
		 * da sua linguagem de programa��o, ou ent�o, se preferir, use diretamente o valor.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int raio;
		float area;
		 
		System.out.println("Insira o valor do raio do c�rculo: ");
		raio = sc.nextInt();
		
		area = (float) (Math.PI * raio * raio);
		
		System.out.printf("A �rea desse c�rculo �: %2.3f", area);
	}
}

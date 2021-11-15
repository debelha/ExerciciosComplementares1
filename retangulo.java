package complementares1;

import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
	 
		/*Fazer um programa para ler as medidas da base e altura de um retângulo. 
		 * Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, 
		 * com quatro casas decimais, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);
		
		float base, altura, area, perimetro, diagonal;
		
		System.out.println("Entre com a base do retângulo: ");
		base = sc.nextFloat();
		
		System.out.println("Entre com a altura do retângulo: ");
		altura = sc.nextFloat();
		
		area = base * altura;
		perimetro = (base + altura) * 2;
		diagonal = (float) Math.sqrt((base * base) + (altura * altura));
		
		System.out.printf("\nÁrea = %2.4f", area);
		System.out.printf("\nPerímetro  = %2.4f", perimetro);
		System.out.printf("\nDiagonal = %2.4f", diagonal);
	}
}

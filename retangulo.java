package complementares1;

import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
	 
		/*Fazer um programa para ler as medidas da base e altura de um ret�ngulo. 
		 * Em seguida, mostrar o valor da �rea, per�metro e diagonal deste ret�ngulo, 
		 * com quatro casas decimais, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);
		
		float base, altura, area, perimetro, diagonal;
		
		System.out.println("Entre com a base do ret�ngulo: ");
		base = sc.nextFloat();
		
		System.out.println("Entre com a altura do ret�ngulo: ");
		altura = sc.nextFloat();
		
		area = base * altura;
		perimetro = (base + altura) * 2;
		diagonal = (float) Math.sqrt((base * base) + (altura * altura));
		
		System.out.printf("\n�rea = %2.4f", area);
		System.out.printf("\nPer�metro  = %2.4f", perimetro);
		System.out.printf("\nDiagonal = %2.4f", diagonal);
	}
}

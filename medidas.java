package complementares1;

import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar 
		 * (imprimir os dados com quatro casas decimais):
         * a) a área do quadrado que tem lado A
         * b) a área do triângulo retângulo que base A e altura B
         * c) a área do trapézio que tem bases A e B, e altura C
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.println("Entre com o valor de A:");
		A = sc.nextFloat();
		
		System.out.println("Entre com o valor de B:");
		B = sc.nextFloat();
		
		System.out.println("Entre com o valor de C:");
		C = sc.nextFloat();
		
		areaQuadrado = A * 4;
		areaTriangulo = (A * B) / 2;
		areaTrapezio = (A + B) * C / 2;
		
		System.out.printf("AREA DO QUADRADO = %2.4f", areaQuadrado);
		System.out.printf("\nAREA DO TRIANGULO = %2.4f", areaTriangulo);
		System.out.printf("\nAREA DO TRAPEZIO = %2.4f", areaTrapezio);
		
		sc.close();
	}
}

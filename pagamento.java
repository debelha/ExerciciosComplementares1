package complementares1;

import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um(a) funcion�rio(a), o valor que ele(a)
		 *  recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, 
		 *  mostrar o valor do pagamento do funcion�rio com uma mensagem explicativa,
		 */

		Scanner sc = new Scanner(System.in);
		
		String pT;
		float valor, hora, salario;
		
		System.out.println("Isira o nome da pessoa trabalhadora: ");
		pT = sc.next();
		System.out.println("Insira o valor recebido por hora: ");
		valor =  sc.nextFloat();
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		hora =  sc.nextFloat();
		
		salario = valor * hora;
		
		System.out.println("Pagamento da "+ pT+" � de "+ salario);
		
		sc.close();
	}
}

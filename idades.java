package complementares1;

import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
	/*Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma
	 *  mensagem com os nomes e a idade média entre essas pessoas, com uma casa decimal
	 */

		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		float media;
		
		System.out.println("Insira seu nome: ");
		nome1 = sc.next();
		System.out.println("Insira sua idade: ");
	    idade1 = sc.nextInt();
	    
	    System.out.println("Insira o nome do seu par: ");
		nome2 = sc.next();
		System.out.println("Insira a idade do seu par: ");
	    idade2 = sc.nextInt();
	    
	    media = (float) (idade1 + idade2) / 2;
	    
	    System.out.println("A média entre a idade de "+ nome1 +" e "+ nome2 + " é de: "+ media);
	    
	    sc.close();
	}
}

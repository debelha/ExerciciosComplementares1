package complementares1;

import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler uma dura��o de tempo em segundos, da� imprimir na tela
		 *  esta dura��o no formato horas:minutos:segundos. 
		 */

		Scanner sc = new Scanner(System.in);
		
		int H, M, S, TS;
		
		System.out.println("Insira o total de segundos: ");
		TS = sc.nextInt();
		
		H = TS / 3600;
		M = (TS % 3600) / 60;
		S = (TS % 3600) % 60;
		
		System.out.println("Dura��o: "+ H + ":" + M +":"+ S);
		
		sc.close();
		
	}
}

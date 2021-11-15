package complementares1;

import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela
		 *  esta duração no formato horas:minutos:segundos. 
		 */

		Scanner sc = new Scanner(System.in);
		
		int H, M, S, TS;
		
		System.out.println("Insira o total de segundos: ");
		TS = sc.nextInt();
		
		H = TS / 3600;
		M = (TS % 3600) / 60;
		S = (TS % 3600) % 60;
		
		System.out.println("Duração: "+ H + ":" + M +":"+ S);
		
		sc.close();
		
	}
}

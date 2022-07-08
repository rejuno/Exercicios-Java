package teste;

import java.util.Scanner;

public class ex4array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MODIFIQUE O EXERCICIO 3 DE FORMA QUE O CONTEUDO DE VET1 SEJA COPIADO PARA VET2 DE FORMA INVERTIDA*/
		Scanner scan = new Scanner (System.in);
		String [] vet1= new String [5];
		String[] vet2 = new String [5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite um numero: ");
			vet1[i] = scan.next();
			vet2[i] = vet1[i];
			
		}
		
		System.out.println("Os valores do vet2 sao: ");
		for(int c = vet2.length - 1; c >=0;c--) {
			System.out.println(vet2[c]);
		}
		
		
		System.out.println("\nOs valores do vet1 sao: ");
		for(int c = 0; c <=4;c++) {
			System.out.println(vet1[c]);
		}
		
		
	}

}

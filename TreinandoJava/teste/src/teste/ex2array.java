package teste;

import java.util.Scanner;

public class ex2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ESCREVA UM CODIGO JAVA QUE SOLICITA 8 INTEIROS AO USUARIO E AGUARDE ESSES VALORES EM UM ARRAY. DEPOIS O PROGRAMA DEVE DESCOBRIR E EXIBIR QUAL A POSICAO DO ELEMENTO DE MAIOR VALOR*/
			Scanner scan = new Scanner (System.in);
			int [] array = new int [8]; //inicializando o array
			
			int maior = 0; //maior numero referencia 
			
			for(int i = 0; i <= 7; i++) {
				System.out.println("Digite um numero: ");
				array[i] = scan.nextInt();
					
					if(maior < array[i]) {
						maior = array[i];
						
					}
					
			}
			
			System.out.println("O maior número é: " + maior);
			

	}

}

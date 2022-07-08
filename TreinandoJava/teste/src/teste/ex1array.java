package teste;

import java.util.Scanner;

public class ex1array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ESCREVA UM CODIGO JAVA QUE PREENCHE UM VETOR (ARRAY) DE TAMANHO 10 COM NÚMEROS LIDOS PELO TECLADO*/
		
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10]; //inicializar o array
		
		for(int i = 0; i<=9; i++) {			
		System.out.println("Digite um numero: ");
		numeros[i] = scan.nextInt();
		
		}
		
		for(int c = 0; c <=9;c++) {
			System.out.println(numeros[c]);
		}
		
	}

}

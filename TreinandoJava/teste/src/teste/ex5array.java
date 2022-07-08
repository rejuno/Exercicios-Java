package teste;

import java.util.Scanner;

public class ex5array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*ESCREVER UM CODIGO JAVA QUE LE 20 NUMEROS REAIS E ARMAZENA ESSES VALORES EM UM ARRAY. O PROGRAMA DEVE CALCULAR A MEDIA ARITMETICA DOS VALORES DO VETOR E IMPRIMIR TODOS OS VALORES MENORES DO QUE A MEDIA CALCULADA*/
			    final int TAM = 20;
			    Scanner ler = new Scanner(System.in);    
			    float vet1[] = new float[TAM];
			    float soma = 0, media = 0;
			    
			    
			    for(int i = 0; i < TAM; i++) {
			        System.out.print("Digite o " + (i + 1) + "° número: ");
			        vet1[i] = ler.nextInt(); 
			    }
			    
			    for(int j = 0; j < TAM; j++) {
			        if(j == 0) {
			            soma = vet1[j];
			        }
			        else {
			            soma += vet1[j];
			        }    
			    }
			    
			    media = soma/TAM;
			    System.out.print("\nMedia: " + media);
			    System.out.print("\nValores abaixo da media: ");
			    for(int x = 0; x < TAM; x++) {
			        if(vet1[x] < media) {
			            System.out.print(vet1[x] + " ");
			        }
			    }
			    
			    ler.close();
			  }
		
		
		
		
	}



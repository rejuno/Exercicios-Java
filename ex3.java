/*Desenvolver um algoritmo para pedir um mês (em número) e o programa deverá imprimir na tela o correspondente por extenso. Por exemplo: 03 – Março ou 09 - Setembro.*/
package projeto;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha um numero correspondente ao mes que deseja: \n 1-Janeiro \n 2-Fevereiro \n 3-Março \n 4-Abril \n 5-Maio \n 6-Junho \n 7-Julho \n 8-Agosto \n 9-Setembro \n 10-Outubro \n 11-Novembro \n 12-Dezembro. ");
		int num = ler.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4: 
			System.out.println("Abril");
			break;
		case 5: 
			System.out.println("Maio");
			break;
		case 6: 
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8: 
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10: 
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12: 
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Por favor, digite um numero entre 1 e 12!!!");
		}
	}

}

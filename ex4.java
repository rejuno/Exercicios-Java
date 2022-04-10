/* Fazer um algoritmo que dado um número, calcular e escrever se este é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo*/
package projeto;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um numero: ");
				int num = ler.nextInt();
				
				if(num > 0 ) {
					System.out.println("Positivo");
					
				}
				else {
					System.out.println("Negativo");
					
				}
				
				if(num%3 == 0) {
					System.out.println("Multiplo de 3");
					
				} else {
					System.out.println("Nao e multiplo de 3");
					
				}
			}
		


	}



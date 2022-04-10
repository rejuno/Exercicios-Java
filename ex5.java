/* Elabore um algoritmo que calcule o valor do fatorial de um número informado pelo usuário. Lembrando que 0! = 1.*/
package projeto;
import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber o fatorial dele: ");
		int num = ler.nextInt();
		int f = num;
		if(num == 0) {
			f = 1;
			
		}
		while(num > 1) {
			f=f*(num-1);
			num --;
			

		}
		System.out.println(f);
				
		
	}
}

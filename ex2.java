package projeto;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = new int[4];
		
		
		Scanner ler = new Scanner(System.in);
		int count = 0;
		
		for(count = 0; count < 4; count++) {
			System.out.println("Digite um número: ");
			num[count] = ler.nextInt();
		
		}
		
		
		if( num[0] >= num[1] && num[0] >= num[2] && num[0] >= num[3]) {
			
			System.out.println("O maior número é: " + num[0]);
			int resultado = num[1] + num[2] + num[3];
			System.out.println("A soma dos 3 menores são: " + resultado);
			
	} else if (num[1] >= num[0] && num[1] >= num[2] && num[1] >= num[3]) {
			
			System.out.println("O maior número é: " + num[2]);
			int resultado = num[0] + num[2] + num[3];
			System.out.println("A soma dos 3 menores são: " + resultado);
			
	} else if (num[2] >= num[0] && num[2] >= num[1] && num[2] >= num[3]) {
			
			System.out.println("O maior número é: " + num[2]);
			int resultado = num[1] + num[0] + num[3];
			System.out.println("A soma dos 3 menores são: " + resultado);
			
	} else if (num[3] >= num[0] && num[3] >= num[2] && num[3] >= num[1]) {
			
			System.out.println("O maior número é: " + num[3]);
			int resultado = num[1] + num[2] + num[0];
			System.out.println("A soma dos 3 menores são: " + resultado);
		
		}
		
	}

	}



package projeto;
import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Digite o 1� numero: ");
			a = ler.nextInt();
		
		System.out.println("Digite o 2� numero: ");
		 	b = ler.nextInt();
		
		System.out.println("Digite o 3� numero: ");
		 	c = ler.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O maior numero e: " + a);
		} else if(b>a && b>c) {
			System.out.println("O maior numero e: " + b);
			
		} else if(c>a && c>b) {
			System.out.println("O maior numero e: " + c);
		}
		
		
		}
	}



package projeto;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Digite os valores dos lados do triangulo: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
	
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("Os 3 lados formam um triangulo!\n");
			if(a == b && a == c) {
				System.out.println("Equilatero\n");
				
			}
			else if(a == b || a == c || b == c) {
				System.out.println("Isosceles\n");
				
			}
			else {
				System.out.println("Escaleno\n");
			}
		}
		else {
			System.out.println("Os 3 lados NAO forman um triangulo!\n");
		}
		
	}
	}



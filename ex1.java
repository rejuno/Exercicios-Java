package projeto;
import java.util.Scanner;

public class ex1{
	public static void main(String[] args) {
		
	
			// TODO Auto-generated method stub
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um n�mero que � divisivel por 3 e 5: ");
				int num = ler.nextInt();
				
				if(num%5 == 0 && num%3 == 0) {
					System.out.println("Parab�ns! O n�mero � divisivel por 3 e 5!");
				} else {
					System.out.println("Resposta Errada");
				}
				ler.close();	
			}
			

		
		
		}


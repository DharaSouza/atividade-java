package primeiro_projeto;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// Variaveis
		double a,b,som;
		
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("Informe valor l: ");
		a = ler.nextDouble();
		
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		//Saída
		System.out.println("O resultado é :" + som);
		ler.close();
			

	}

}

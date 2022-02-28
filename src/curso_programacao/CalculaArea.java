package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura:  ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o Comprimento:  ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite o metro quadrado:  ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("AREA =  %.2f%n", area);
		System.out.printf("PREÇO =  %.2f%n", preco);
		
		sc.close();
		

	}

}

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double c;
		char caract;
		x = sc.next();
		y = sc.nextInt();
		c = sc.nextDouble();
		caract = sc.next().charAt(0);
		
		
		System.out.println("Voce Digitou: " + x);
		System.out.println("Voc� Digitou inteiro: " + y);
		System.out.printf("Voc� digitou double: %.2f%n", c);
		System.out.println("Voc� digitou caractere: " + caract);
		
		sc.close();
		
		
		
		

	}

}

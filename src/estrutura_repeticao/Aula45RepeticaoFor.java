package estrutura_repeticao;

import java.util.Scanner;

public class Aula45RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.println("Valor de I : "+ i);
			int  x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}

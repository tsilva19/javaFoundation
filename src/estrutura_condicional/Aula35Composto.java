package estrutura_condicional;

import java.util.Scanner;

public class Aula35Composto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas ?");
		hora =  sc.nextInt();
		
		if (hora < 12) { 
		System.out.println("Bom dia");
		}
		else if (hora < 18) {
				System.out.println("Bom tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		
		sc.close();
	}

}

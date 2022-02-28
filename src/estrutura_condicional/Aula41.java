package estrutura_condicional;

public class Aula41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 400.0;
		
		double discount;
		
		if (price < 200.00 ) {
			discount = price * 0.1;
			
		}
		
		else {
			discount = 0;
		}
		
		System.out.println(discount);
		

	}

}

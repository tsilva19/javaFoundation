package funcoes;

public class Palavras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "THIAgo AlVes DA silva";
		
		String formata = nome.toLowerCase();
		
		String formata2 = nome.toUpperCase();
		String formata3 = nome.trim();
		String formata4 = nome.substring(2);
		String formata5 = nome.substring(2, 9);
		String formata6 = nome.replace('a', 'e');
		int i = nome.indexOf("AlVes");
		int j = nome.lastIndexOf("AlVes");
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		System.out.println("Original:  -" + nome +  "-");
		System.out.println("Formatado: -" + formata + "-");
		System.out.println("Formatado: -" + formata2 + "-");
		System.out.println("Formatado: -" + formata3 + "-");
		System.out.println("Formatado: -" + formata4 + "-");
		System.out.println("Formatado: -" + formata5 + "-");
		System.out.println("Formatado: -" + formata6 + "-");
		System.out.println("Index of 'TH" + i);
		System.out.println("Last of 'TH" + j);

	}

}

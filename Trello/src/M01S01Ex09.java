import java.util.Scanner;

public class M01S01Ex09 {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa em Java que pergunte ao usuário via linha de
		 * comando qual seu herói favorito. Atribua a resposta em uma variável. Imprima
		 * no console a frase: "Seu herói favorito é <nome do herói informado>".
		 * 
		 */
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Qual seu herói favorito: ");
			String heroi = scanner.nextLine();
			
			System.out.println("Seu herói favorito é o herói :" + heroi);
		}
		
		
		
		
		
	}

}

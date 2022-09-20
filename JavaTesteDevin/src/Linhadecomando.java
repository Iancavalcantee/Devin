import java.util.Scanner;

public class Linhadecomando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// objeto que ler a entrada padrao do teclado
		
		
		System.out.println("Imprima seu nome: ");
		String entrada = scanner.nextLine(); //.next somente uma palavra
		
		System.out.println("idade");
		int idade = scanner.nextInt();
		
		System.out.println("idadestr");
		
		String idadestr = scanner.nextLine();
		
		Integer idadeInt = Integer.valueOf(idadestr);
		
		

		
		
		
		
	}

}

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDate;

public class M01S01Ex10 {

	public static LocalDate data = LocalDate.now();

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		@SuppressWarnings("deprecation")
		int year = date.getYear();

		System.out.println(year);

		int currentYear = year + 1900;

		System.out.println(year + 1900);

		// TODO Auto-generated method stub
		/*
		 * Descrição: Escreva um programa em Java que pergunte ao usuário via linha de
		 * comando qual o ano de seu nascimento. Com base no ano informado, imprima no
		 * console a idade calculada deste usuário. Dicas: - Atribua o ano informado a
		 * uma variável. - Crie uma instância da data atual (LocalDate), e extraia o ano
		 * da data atual (pesquise sobre o método getYear() da classe LocalDate). - Faça
		 * a conta da idade subtraindo o ano informado do ano atual.
		 * 
		 * 
		 * @author
		 * 
		 * @since
		 * 
		 * @version
		 * 
		 * 
		 * 
		 */

		System.out.println(data);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual seu ano de nascimento: ");
		int ano = scanner.nextInt();
		int idade = currentYear - ano;

		System.out.println(idade);

	}

}

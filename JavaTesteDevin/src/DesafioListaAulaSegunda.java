import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 

public class DesafioListaAulaSegunda {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		// System.out.println(num);
		System.out.println(Arrays.toString(num));

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		List<Integer> nomes = new ArrayList<>();

		nomes.add(1);
		nomes.add(2);
		nomes.add(3);
		nomes.add(4);

		System.out.println(nomes);

		System.out.println("1 - Primeira Opção");

		System.out.println("2 - Segunda Opção");

		System.out.println("3 - Terceira Opção");

		System.out.println("4 - Quarta Opção");

		System.out.println("Digite a opção desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		boolean contemNome = nomes.contains(opcao);

		boolean contemNumbers = numbers.contains(opcao);

		System.out.println(contemNome);

		System.out.println(contemNumbers);

	}

}

/*
 * List<String> opt =
 * Arrays.asList("1- Primeira opção","2 - Segunda Opção","3 - Terceira Opção"
 * ,"4 - Quarta Opção"); for (int i = 0; i < numb.size(); i++){
 * System.out.println(opt.get(i)); };
 */

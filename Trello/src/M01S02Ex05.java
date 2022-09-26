import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M01S02Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de elementos: ");
		int x = sc.nextInt();

		int valor[] = new int[x];
		int maior = 0, menor = 999999999;

		if (x == 1) {
			System.out.println("Situacao inexistente ");

		}

		else {

			for (int i = 0; i < valor.length; i++) {
				System.out.println("Digite o " + (i + 1) + " valor:");
				valor[i] = sc.nextInt();

				if (valor[i] > maior) {
					maior = valor[i];

				}

			}

			for (int j = 0; j < valor.length; j++) {
				if (valor[j] < menor) {
					menor = valor[j];
				}

			}

			System.out.println("Maior valor " + maior);
			System.out.println("Menor valor " + menor);

		}
	}
}

/*
 * 
 * 
 * 
 * Implemente uma função 'calcular' que receba como parâmetro um array
 * (numérico) e identifique o maior e menor valor do mesmo. Imprima no console
 * estes valores ou "Não é possível calcular" qdo não for possível.
 * 
 * Teste a função com as seguintes entradas:
 * 
 * - {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47} - {1} - {1, -1} -
 * null - {-2,-2,-2,-2} - {20,10, 30}
 * 
 */

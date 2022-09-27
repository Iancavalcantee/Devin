import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class M01S02Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[]lista = {0,2,88,56,33,42,67,3,9,0,2};

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de elementos: ");
		int x = sc.nextInt();

		int valor[] = new int[x]; // declaracao da array e respectivo tamanho

		int[] lista = new int[11];
		lista[0] = 0;
		lista[1] = 2;
		lista[2] = 88;
		lista[3] = 56;
		lista[4] = 33;
		lista[5] = 42;
		lista[6] = 67;
		lista[7] = 3;
		lista[8] = 9;
		lista[9] = 0;
		lista[10] = 2;

		// int[] lista = {0,2,88,56,33,42,67,3,9,0,2};

		// List<Integer> numeros = Arrays.asList(0, 2, 88, 56, 33, 42, 67, 3, 9, 0, 2);

		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " + (i + 1) + " valor:");
			valor[i] = sc.nextInt();

			if (valor[i] < 50) {
				
				

				
				continue;
			}else {
				
				System.out.println("Sistema finalizado no "+ (i+1) + "posicao");

				System.out.println(i+1);
			}

		}

	}
}
/*
 * Localize na lista abaixo e imprima no console a primeira ocorrência de número
 * maior que 50.
 * 
 * List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
 */

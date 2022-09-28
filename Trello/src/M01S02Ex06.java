import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M01S02Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> lista = new ArrayList<>();

		// List<Integer> lista = Arrays.asList(1,2,3,4);
		int[] lista = { 1, 2, 3, 4 };

		List<Integer> lista3x = new ArrayList<>();

		for (int i = 0; i < lista.length; i++) {

			// List<Integer> lista3x = Arrays.asList(lista1[i] * 3);
			int x = (lista[i] * 3);
			lista3x.add(x);

			System.out.println("lista3x: " + lista3x);

		}

		System.out.println("lista3x: " + lista3x);

	}

}
//Listas Dado a lista de números:

/*
 * List<Integer> lista = Arrays.asList(1,2,3,4);
 * 
 * Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M01S02Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> lista = new ArrayList<>();

		// List<Integer> lista = Arrays.asList(1,2,3,4);
		int[] lista1 = { 1, 2, 3, 4 };

		for (int i = 0; i < lista1.length; i++) {

			// List<Integer> lista3x = Arrays.asList(lista1[i] * 3);
			int x = lista1[i] * 3;
			List<Integer> lista3x = new ArrayList<>();
			lista3x.add(x);

			System.out.println("lista3x: " + lista3x);

		}

	}

}
//Listas Dado a lista de números:

/*
 * List<Integer> lista = Arrays.asList(1,2,3,4);
 * 
 * Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
 */

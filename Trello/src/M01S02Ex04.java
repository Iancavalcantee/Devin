
public class M01S02Ex04 {

	public static void main(String[] args) {
		/*
		 * Mike tem um nro da sorte: 25. Ele conseguiu uma listagem do histórico dos
		 * resultados da loteria conforme arrays abaixo. Escreva um código para
		 * percorrer os elementos de nros sorteados e contabilizar quantas vezes o nro
		 * da sorte dele foi sorteado. Dica: Usar um for dentro do outro para percorrer
		 * os arrays internos.
		 * 
		 * 
		 * ``` int sorteados[][] = { { 1, 44, 6, 2, 45, 60}, {10, 21, 55, 25, 34, 44}, {
		 * 8, 18, 28, 29, 55, 59}, {60, 25, 11, 34, 6, 9}, {55, 43, 25, 12, 7, 11} };
		 * 
		 * 
		 */
		int x = 0;

		int sorteados[][] = { { 1, 44, 6, 2, 45, 60 }, { 10, 21, 55, 25, 34, 44 }, { 8, 18, 28, 29, 55, 59 },
				{ 60, 25, 11, 34, 6, 9 }, { 55, 43, 25, 12, 7, 11 } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {

				// System.out.println(sorteados[i][j]);

				if (sorteados[i][j] == 25) {

					x = x + 1;

					// System.out.println(sorteados[i][j]);

					// System.out.println(x);

				}

				// System.out.println(x);

			}

			// System.out.println(x);

		}

		System.out.println(x);

	}

}


public class M01S02Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Percorra array com estrutura de repetição e faça operações com condicionais:
		 * 
		 * 
		 * O array abaixo representa lançamentos na conta bancária do Luke. Os valores
		 * negativos são débitos e os valores positivos são créditos.
		 * 
		 * Implemente um código copiando o array abaixo, e depois imprima no console o
		 * que se pede:
		 * 
		 * int[] extrato = { 100, -35, -15, -5, 55, -20 };
		 * 
		 * a) Percorra o array (operador 'for') e imprima cada elemento do array na
		 * ordem; b) Percorra o array (operador 'for') e imprima os elementos de trás
		 * pra frente (do último para o primeiro); c) Percorra o array (operador 'for')
		 * e calcule o saldo final da conta (valor inicial era zero), imprima o
		 * resultado no console. (Dica: crie uma variável saldo inicializada com zero e
		 * vá atualizando seu valor); d) Imprima no console a mensagem 'saldo positivo'
		 * ou 'saldo negativo', dependendo do resultado do saldo final calculado.
		 */

		int saldo = 0;
		int[] extrato = { 100, -35, -15, -5, 55, -20 };

		System.out.println("Alternativa a");

		for (int i = 0; i < 6; i++) {

			System.out.println(extrato[i]);

		}

		System.out.println("Alternativa b");
		for (int i = 5; i >= 0; i--) {
			System.out.println(extrato[i]);

		}

		System.out.println("Alternativa c");

		for (int i = 0; i < 6; i++) {
			saldo = saldo + extrato[i];
			System.out.println("Operações realizadas " + saldo);
		}
		System.out.println("O saldo final da conta é: " + saldo);

		// Imprima no console a mensagem 'saldo positivo'
		// * ou 'saldo negativo', dependendo do resultado do saldo final calculado.

		System.out.println("Alternativa d");
		if (saldo >= 0) {
			System.out.println("Saldo positivo");

		} else {

			System.out.println("Saldo negativo");
		}

	}

}

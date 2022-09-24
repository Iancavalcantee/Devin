import javax.swing.JOptionPane;

public class M01S01Ex08 {

	public static void main(String[] args) {
		/*
		 * O sistema de pontuação por partida no Campeonato Brasileiro de Futebol
		 * funciona assim: Vitória = 3 pontos Derrota = 0 pontos Empate = 1 ponto Dado
		 * que o time 'Tabajara F.C.' tem 12 vitórias, 2 derrotas e 6 empates,
		 * implemente um código em Java para calcular a quantidade de pontos e de jogos
		 * deste time e imprimir no console a frase abaixo (preenchendo-a com os
		 * respectivos valores):
		 * "O time <NOME_DO_TIME> acumulou <NRO_DE_PTOS> após jogar <NRO_PARTIDAS> partidas"
		 * . Dicas: - Crie variáveis para guardar o valor de vitórias, derrotas e
		 * empates. - Crie outra variável para guardar o número de partidas (soma de
		 * vitórias, derrotas e empates). - Crie outra variável para receber o resultado
		 * do cálculo de pontos.
		 */

		// Digite 12 vitórias, 2 derrotas e 6 empates

		int vit = Integer.parseInt(JOptionPane.showInputDialog("Vitórias"));
		JOptionPane.showMessageDialog(null, vit);

		int der = Integer.parseInt(JOptionPane.showInputDialog("Derrotas"));
		JOptionPane.showMessageDialog(null, der);

		int emp = Integer.parseInt(JOptionPane.showInputDialog("Empates"));
		JOptionPane.showMessageDialog(null, emp);

		int nro_partidas = vit + der + emp;
		int pts = (3 * vit) + (emp);

		String nome = (JOptionPane.showInputDialog("Nome do time "));
		JOptionPane.showMessageDialog(null, nome);

		// Scanner scanner = new Scanner(System.in);

		// System.out.println("nome");
		// String nome = scanner.nextLine();

		String frase = JOptionPane.showInputDialog(
				"O time " + nome + " acumulou " + pts + " pontos " + "após jogar " + nro_partidas + " partidas");
		JOptionPane.showMessageDialog(null, frase);

	}

}

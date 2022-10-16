package labschool.models;

package labschool.controlers;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import labschool.dao.AlunoDao;
import labschool.models.Aluno;

public class controllerAluno {
	
	

		AlunoDao servicosConexao = new AlunoDao();
		Scanner dado = new Scanner(System.in);

		@Test
		public void novoAluno() {

			Aluno aluno = new Aluno();

			System.out.println("Nome do Aluno(a): ");
			aluno.setNome(dado.nextLine());

			System.out.println("Telefone: ");
			aluno.setTelefone(dado.next());

			System.out.println("Data de Nascimento: ");
			aluno.setDataNascimento(dado.next());

			System.out.println("CPF: ");
			aluno.setCpf(dado.next());

			System.out.println("SITUAÇÕES: 1-Ativo 2-Atendimento Pedagogico 3-Inativo e 4-Irregular ");
			System.out.println("Situação da Matricula: ");
			int situacaoMatricula = dado.nextInt();

			String matricula = "";

			switch (situacaoMatricula) {
			case 1:
				matricula = "ATIVO";
				break;

			case 2:
				matricula = "ATENDIMENTO PEDAGOGICO";
				break;

			case 3:
				matricula = "INATIVO";
				break;

			case 4:
				matricula = "IRREGULAR";
				break;

			default:
				matricula = "MATRICULA INVALIDA";
				break;
			}

			aluno.setMatricula(matricula);

			System.out.println("O sistema só aceita notas de 0 à 10.");
			System.out.println("Nota: ");
			int notaAluno = dado.nextInt();

			int numero = notaAluno;
			while (numero > 10) {

				System.out.println("Nota Invalida. Digite novamente.");
				System.out.println("Nota: ");
				numero = dado.nextInt();

				if (numero <= 10) {
					notaAluno = numero;
					break;
				}

				numero++;

			}

			aluno.setNota(notaAluno);
			servicosConexao.addAluno(aluno);

		}

		@Test
		public void listaAluno() throws SQLException {

			List<Aluno> listAlunos = servicosConexao.listar();

			for (Aluno aluno : listAlunos) {
				System.out.println("Codigo: " + aluno.getCodigo());
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Telefone: " + aluno.getTelefone());
				System.out.println("CPF: " + aluno.getCpf());
				System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
				System.out.println("Situação da Matricula: " + aluno.getMatricula());
				System.out.println("Nota: " + aluno.getNota());

				System.out.println("================================================");
			}
		}

		@Test
		public void excluirAluno() throws SQLException {

			System.out.println("Qual aluno deseja excluir? ");
			Long codigo = dado.nextLong();

			servicosConexao.removerAluno(codigo);

		}

		@Test
		public void alterarAluno() throws SQLException {

			System.out.println("Qual aluno deseja alterar?");
			Long codigo = dado.nextLong();

			int novaSituacao;
			System.out.println("SITUAÇÕES: 1-Ativo 2-Atendimento Pedagogico 3-Inativo e 4-Irregular ");
			System.out.println("Para que situação deseja alterar a matricula do Aluno?");
			novaSituacao = dado.nextInt();

			String matricula = "";

			switch (novaSituacao) {
			case 1:
				matricula = "ATIVO";
				break;

			case 2:
				matricula = "ATENDIMENTO PEDAGOGICO";
				break;

			case 3:
				matricula = "INATIVO";
				break;

			case 4:
				matricula = "IRREGULAR";
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

			servicosConexao.alterarMatricula(codigo, matricula);

		}

	}


}

package labschool.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import labschool.models.Aluno;

public class cadastroAlunos {

	//public class AppTest {

		public void novosAlunos() {
			Scanner s = new Scanner(System.in);
			System.out.println("Qual é a quantidade de alunos da turma? ");

			int totalAlunosAdd = s.nextInt();

			String situacao[] = { "Ativo", "Inativo", "Irregular" };

			List<Aluno> listaAlunos = new ArrayList<Aluno>();

			Long codigo = 1L;

			for (int totalAlunos = 1; totalAlunos <= totalAlunosAdd; totalAlunos++) {

				Aluno aluno = new Aluno();
				aluno.setCodigo(codigo);

				System.out.println("Qual é o nome do aluno? ");

				String nomeAluno = s.next();

				aluno.setNome(nomeAluno);

				System.out.println("0- Ativo//// 1- Inativo//// 2- Irregular");

				System.out.println("Qual é a situação da Matrícula do aluno?");

				int situacaoMatricula = s.nextInt();

				aluno.setMatricula(situacao[situacaoMatricula]);


				codigo = codigo + 1;
			}

			System.out.println("=====================================");

			for (Aluno aluno : listaAlunos) {
				System.out.println("Código do Aluno(a):" + aluno.getCodigo());
				System.out.println("Nome do Aluno(a):" + aluno.getNome());
				System.out.println("Situação da Matrícula: " + aluno.getMatricula());
			}

			System.out.println("=====================================");

		}
	}


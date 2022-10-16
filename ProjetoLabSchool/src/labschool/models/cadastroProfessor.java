package labschool.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cadastroProfessor {

	public void novosProfessores() {
			Scanner s = new Scanner(System.in);
			System.out.println("Qual é a quantidade de professores? ");

			int totalProfAdd = s.nextInt();

			String situacao[] = { "Ativo", "Inativo"};

			String formacao[] = { "Graduação incompleta\n"
					, "Graduação completa\n"
					, "Mestrado", "Doutorado"};
			
			String experiencia[] = { "0-Front-End", "1-Back-End", "2-Full-Stack"};
			
			
			
			List<Professor> listaProfessores = new ArrayList<Professor>();

			//List<atributos> cadastro = new ArrayList<atributos>();

		

			for (int totalProf = 1; totalProf <= totalProfAdd; totalProf++) {

				Professor professor = new Professor();
				

				System.out.println("Qual é o nome do Professor? ");

				String nomeProfessor = s.next();

				professor.setNome(nomeProfessor);

				System.out.println("0- Ativo//// 1- Inativo////");

				System.out.println("Qual é a situação do estado do professor?");

				int situacaoMatricula = s.nextInt();
				
				
				System.out.println("Digite 0-Graduação incompleta 1-Graduação completa 2-Mestrado 3-Doutorado");
				
				System.out.println("Qual é a especialização do professor?");
				
				int formacaoAcad = s.nextInt();
				
				
				System.out.println("0-Front-End 1-Back-End 2-Full-Stack");
				
				

				System.out.println("Qual é a experiencia em desenvolvimento do professor?");

				int situacaoExp = s.nextInt();
				

				
				
				professor.setExp(experiencia[situacaoExp]);
				
				professor.setEstado(situacao[situacaoMatricula]);
				
				professor.setformacao(formacao[formacaoAcad]);
				
				
			
	}

//listaProfessores.add(professor);

	}}
/*
 * System.out.println("=====================================");
 * 
 * for (Professor professor : listaProfessores) {
 * System.out.println("Código do Aluno(a):" + aluno.getCodigo());
 * System.out.println("Nome do Aluno(a):" + aluno.getNome());
 * System.out.println("Estadp: " + aluno.getMatricula());
 * 
 */

// System.out.println("=====================================");



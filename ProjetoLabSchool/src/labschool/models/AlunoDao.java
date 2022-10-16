package labschool.models;
package labschool.models;


	
	
	

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import labschool.conexao.SingleConnection;
	import labschool.models.Aluno;

	public class AlunoDao {

		private Connection connection;
		
		String sql = "";
		
		public AlunoDao() {
			connection = SingleConnection.getConnection();
		}
		
		public void addAluno(Aluno aluno) {
			try {

				sql = "INSERT INTO alunos (nome,telefone,data_nascimento,cpf,"
						+ "situacao_matricula,nota) values (?,?,?,?,?,?)";
				
				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getTelefone());
				stmt.setString(3, aluno.getDataNascimento());
				stmt.setString(4, aluno.getCpf());
				stmt.setString(5, aluno.getMatricula());
				stmt.setInt(6, aluno.getNota());
				stmt.execute();
				connection.commit();
				
				connection.close();
				
				System.out.println("Aluno adicionado com Sucesso.");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public List<Aluno> listar() throws SQLException {
			
			List<Aluno> listAluno = new ArrayList<Aluno>();

			sql = "SELECT * FROM Alunos";

			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();

			while (resultado.next()) {

				Aluno aluno = new Aluno();
				
				aluno.setCodigo(resultado.getLong("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setTelefone(resultado.getString("telefone"));
				aluno.setDataNascimento(resultado.getString("data_nascimento"));
				aluno.setCpf(resultado.getString("cpf"));
				aluno.setMatricula(resultado.getString("situacao_matricula"));
				aluno.setNota(resultado.getInt("nota"));
				
				listAluno.add(aluno);
			}

			return listAluno;
			
		}

		public void removerAluno(Long codigo) throws SQLException {

			sql = "DELETE FROM Alunos WHERE codigo = " + codigo;

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
			
			System.out.println("Aluno(a) removido com sucesso!");
		}

		public void alterarMatricula(Long codigo, String matricula) throws SQLException {

			sql = "UPDATE Alunos set situacao_matricula=? where codigo = " + codigo;

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, matricula);
			stmt.executeUpdate();
			connection.commit();
			
			System.out.println("Situação da matricula alterada. ");
			
		}
		
	}
}

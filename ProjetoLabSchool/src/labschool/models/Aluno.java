package labschool.models;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ld;*/

/*@Entity*//*@ld
			@GeneratedValue(strategy = GenerationType.AUTO)*/


public class Aluno extends Pessoa{
	private Long codigo;
	private String matricula;
	private int nota;
	private String nomeAluno;

	public Long getCodigo() {
		return codigo;

	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;

	}

	public String getMatricula() {
		return matricula;

	}

	public void setMatricula(String matricula) {

		this.matricula = matricula;
	}

	public int getNota() {
		return nota;
	}

	public void setNome(String nomeAluno) {
		this.nomeAluno = nomeAluno;

	}

	public String getNome() {
		return nomeAluno;
	}

	

}

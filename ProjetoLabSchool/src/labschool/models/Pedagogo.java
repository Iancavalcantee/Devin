
package labschool.models;
/*
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entityc*/
	public class Pedagogo extends Pessoa{ 
		
		//private static final long serialVersionUID = 1L;

		//@Id
		//@GeneratedValue(strategy = GenerationType.AUTO)
		private Long codigo;
		
		public Long getCodigo() 
		{
			return codigo;
		}
		
		public void setId(Long codigo) {
			this.codigo = codigo;
		}
		
	}




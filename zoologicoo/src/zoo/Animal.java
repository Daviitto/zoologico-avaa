package zoo;

public abstract class Animal {
	protected String nome;
	protected int idade;
 
	
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
				
	}
	public abstract void fazerSom();
	
	public String getNome() {
		return nome;
	}
	
	public int getidade() {
		return idade;
	}
	
	interface ComportamentoAlimentar {
		void alimentar();
		}
	
	interface ComportamentVoar {
		void Voar();
	}
	
}

	
	
	
	


	 
	 
			
		
		
	 
	 
	 
	 
	 
	 
	 
	 

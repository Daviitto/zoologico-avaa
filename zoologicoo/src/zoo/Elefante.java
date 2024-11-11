package zoo;

class Elefante extends Animal implements zoo.Animal.ComportamentoAlimentar{ 	  	 
	public Elefante(String nome, int idade) {
		super(nome, idade);	
	}

	
	@Override
	public void fazerSom() {
		System.out.println("O elefante faz um som de trombeta: BRRRUUUUUU! ");
		
	}

	@Override
	public void alimentar() {
		System.out.println("O elefante está comendo frutas. ");
		
	}
}
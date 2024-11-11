package zoo;

class Ave extends Animal implements zoo.Animal.ComportamentoAlimentar, zoo.Animal.ComportamentVoar {
    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("A ave canta!");
    }

    @Override
    public void alimentar() {
        System.out.println("A ave está bicando sementes.");
    }


	@Override
	public void Voar() {
	System.out.println("O passáro está voando");	
		
	}
}

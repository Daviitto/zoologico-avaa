package zoo;  // Definindo o pacote, que deve ser o mesmo de outras classes

public class Leao extends Animal implements Animal.ComportamentoAlimentar {

    // Construtor da classe Leao que chama o construtor da classe Animal
    public Leao(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da classe pai (Animal)
    }

    // Implementação do método 'fazerSom' que imprime o som do leão
    @Override
    public void fazerSom() {
        System.out.println("O leão está rugindo: RROOAAARRR!");
    }

    // Implementação do método 'alimentar' que imprime o comportamento alimentar do leão
    @Override
    public void alimentar() {
        System.out.println("O leão está comendo carne.");
    }
}
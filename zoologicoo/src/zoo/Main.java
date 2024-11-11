package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria uma lista de diferentes tipos de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(new Elefante("Dumbo", 10));
        animais.add(new Leao("Simba", 5));
        animais.add(new Ave("Blue", 2));

        // Demonstra o polimorfismo chamando o método fazerSom() de cada animal
        emitirSons(animais);

        // Demonstra o comportamento alimentar de cada animal
        alimentarAnimais(animais);

        // Demonstra o comportamento de voo, se aplicável
        voarAnimais(animais);
    }

    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.fazerSom();  // Chama o método específico com base no tipo do objeto
        }
    }

    public static void alimentarAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            if (animal instanceof Animal.ComportamentoAlimentar) {
                ((Animal.ComportamentoAlimentar) animal).alimentar();
            }
        }
    }

    public static void voarAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            if (animal instanceof Animal.ComportamentVoar) {
                ((Animal.ComportamentVoar) animal).Voar();
            }
        }
    }
}
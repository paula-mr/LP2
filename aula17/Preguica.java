package aula17;

/**
 *
 * @author Paula
 */
public class Preguica extends Animal implements Movimento {
    public Preguica() {}
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "Bocejo";
    }
    @Override
    public String movimento() {
        return "Sobe em árvore";
    }
    @Override
    public String toString() {
        return "Cavalo\nNome: " + nome + "\nIdade: " + idade; 
    }
}
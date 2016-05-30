package aula17;

/**
 *
 * @author Paula
 */
public class Cachorro extends Animal implements Movimento {
    public Cachorro() {}
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "AuAu";
    }
    @Override
    public String movimento() {
        return "Corre";
    }
    @Override
    public String toString() {
        return "Cachorro\nNome: " + nome + "\nIdade: " + idade;
    }
}
package aula17;

/**
 *
 * @author Paula
 */
public class Cavalo extends Animal implements Movimento {
    public Cavalo() {}
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "Relincho";
    }
    @Override
    public String movimento() {
        return "Corre";
    }
    @Override
    public String toString() {
        return "Cavalo\nNome: " + nome + "\nIdade: " + idade; 
    }
}
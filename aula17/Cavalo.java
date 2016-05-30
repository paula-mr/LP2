package aula17;

/**
 *
 * @author Paula
 */
public class Cavalo extends Animal {
    public Cavalo() {}
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "Relincho";
    }
    public String corre() {
        return "Correu";
    }
}

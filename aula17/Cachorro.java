package aula17;

/**
 *
 * @author Paula
 */
public class Cachorro extends Animal {
    public Cachorro() {}
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "AuAu";
    }
    public String corre() {
        return "Correu";
    }
}

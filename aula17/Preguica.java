package aula17;

/**
 *
 * @author Paula
 */
public class Preguica extends Animal {
    public Preguica() {}
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom() {
        return "Bocejo";
    }
    public String sobeArvore() {
        return "Subiu na árvore";
    }
}

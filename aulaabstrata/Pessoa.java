package aulaabstrata;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected String nome;
    protected int identidade;
    public Pessoa() {}
    public Pessoa(String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }
    public abstract String getNome();
    public abstract  void setNome(String nome);
    public abstract int getIdentidade();
    public abstract void setIdentidade(int identidade);
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdentidade: " + getIdentidade();
    }
}

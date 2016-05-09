package aulaabstrata;

/**
 *
 * @author Aluno
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private Professor prof;
    public Disciplina() {}
    public Disciplina(String nome, int codigo, Professor prof) {
        this.nome = nome;
        this.codigo = codigo;
        this.prof = prof;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Professor getProf() {
        return prof;
    }
    public void setProf(Professor prof) {
        this.prof = prof;
    }
    @Override
    public String toString() {
        return "Disciplina: " + getNome() + "\nCódigo: " + getCodigo();
    }
}

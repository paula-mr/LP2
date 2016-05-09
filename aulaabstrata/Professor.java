package aulaabstrata;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    private int matricula;
    private Disciplina disciplina;
    public Professor() {}
    public Professor(int matricula, Disciplina disciplina, String nome, int identidade) {
        super(nome, identidade);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int getIdentidade() {
        return identidade;
    }
    @Override
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + getMatricula() + "\nDisciplina: " + getDisciplina();
    }
}

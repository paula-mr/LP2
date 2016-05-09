package aulaabstrata;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    private int matricula;
    private int cont;
    private String retDisciplinas;
    private Disciplina[] d;
    public Aluno() {
        cont = 0;
        d = new Disciplina[5];
    }
    public Aluno(int matricula, Disciplina[] d, String nome, int identidade) {
        super(nome, identidade);
        this.matricula = matricula;
        
        this.d = d;
        cont = 0;
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
    public Disciplina[] getDisciplinas() {
        return d;
    }
    public void setDisciplinas(Disciplina[] disciplinas) {
        this.d = disciplinas;
    }
    public void setDisciplinas(Disciplina disciplinas) {
        this.d[cont] = disciplinas;
        cont++;
    }
    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + getMatricula();
    }
}

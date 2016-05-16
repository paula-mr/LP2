package aula13;

/**
 *
 * @author Aluno
 */
public abstract class Passageiro extends Voo {
    protected int id;
    public Passageiro() {}
    public Passageiro(int id, int numVoo, String destino, double preco) {
        super(numVoo, destino, preco);
        this.id = id;
    }
    public Passageiro(int id) {
        this.id = id;
    }
    @Override
    public void setId(int id) {
        this.id=id;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return super.toString() + "\nIdentidade do passageiro: " + id;
    }
}
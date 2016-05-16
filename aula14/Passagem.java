package aula13;

/**
 *
 * @author Aluno
 */
public class Passagem extends Passageiro {
    public Passagem() {}
    public Passagem(double preco, int id, int numVoo, String destino) {
        super(id, numVoo, destino, preco);
    }
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return super.toString() + "\nPreço: " + preco;
    }
}

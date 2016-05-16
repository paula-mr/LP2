
package aula13;

/**
 *
 * @author Aluno
 */
public abstract class Voo {
    protected int numVoo;
    protected String destino;
    protected double preco;
    public Voo(){}
    public Voo(int numVoo, String destino, double preco) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.preco = preco;
    }
    public int getNumVoo() {
        return numVoo;
    }
    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public abstract double getPreco();
    public abstract void setPreco(double preco);
    public abstract void setId(int id);
    public abstract int getId();
    @Override
    public String toString() {
        return "Destino: " + destino + "\nNúmero do vôo: " + numVoo;
    }
}

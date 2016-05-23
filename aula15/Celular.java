package aula15;

/**
 *
 * @author Paula
 */
public class Celular extends Info {
    private int quantidade;
    private double preco;
    public Celular() {}
    public Celular(int quantidade, double preco, String modelo, String marca) {
        super(modelo, marca);
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    @Override
    public void venda() {
        quantidade--;
    }
    @Override
    public int estoque() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "Quantidade de " + getModelo() +" "+ getMarca()+ " no estoque: " + estoque();
    }
}
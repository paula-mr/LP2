package aula15;

/**
 *
 * @author Paula
 */
public class Impressora extends Info {
    private int quantidade;
    private double preco;
    private String tipo;
    private int estoque;
    public Impressora() {}
    public Impressora(int quantidade, double preco, String tipo, String modelo, String marca) {
        super(modelo, marca);
        this.quantidade = quantidade;
        this.preco = preco;
        this.tipo = tipo;
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
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "Quantidade de " + getModelo() + getMarca()+ " no estoque: " + estoque();
    }
}
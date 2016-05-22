package aula15;

/**
 *
 * @author Paula
 */
public class Computador extends Info implements Produtos {
    private double preco;
    private int quantidade;
    private int memoria;
    private int vendas;
    private int estoque;
    public Computador() {}
    public Computador(double preco, int quantidade, int memoria, String modelo, String marca) {
        super(modelo, marca);
        this.quantidade = quantidade;
        this.preco = preco;
        this.memoria = memoria;
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
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    @Override
    public int venda(int prodVendidos) {
        vendas = prodVendidos;
        return vendas;
    }
    @Override
    public int estoque() {
        return quantidade-vendas;
    }
}

package aula15;

/**
 *
 * @author Paula
 */
public class Impressora extends Info implements Produtos {
    private int quantidade;
    private int preco;
    private String tipo;
    private int vendas;
    private int estoque;
    public Impressora() {}
    public Impressora(int quantidade, int preco, String tipo, String modelo, String marca) {
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
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

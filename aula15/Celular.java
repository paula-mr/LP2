package aula15;

/**
 *
 * @author Paula
 */
public class Celular extends Info implements Produtos {
    private int quantidade;
    private int preco;
    private int vendas;
    public Celular() {}
    public Celular(int quantidade, int preco, String modelo, String marca) {
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
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
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

package aula5;
/**
 *
 * @author Paula
 */
public class cachorro {
    String nome;
    String som;
    double quantAlimentoD;
    static double quantRacao=10;
    public cachorro() {}
    public cachorro(String nome, String som, double quantAlimentoD) {
        this.nome = nome;
        this.som = som;
        this.quantAlimentoD = quantAlimentoD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public double getQuantAlimentoD() {
        return quantAlimentoD;
    }
    public void setQuantAlimentoD(double quantAlimentoD) {
        this.quantAlimentoD = quantAlimentoD/1000;
        //transformando a quantidade de gramas em kg
    }
    public static double getQuantRacao() {
        return quantRacao;
    }
    public void alimento() {
        quantRacao-=this.quantAlimentoD;
    }
}

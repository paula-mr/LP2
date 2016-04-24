package aula12;

/**
 *
 * @author Paula Ribeiro
 */
public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;
    public Retangulo() {}
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getArea() {
        return largura*altura;
    }
    public double getPerimetro() {
        return (2*largura)+(2*altura);
    }
}

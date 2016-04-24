package aula12;

/**
 *
 * @author Paula Ribeiro
 */
public class Circulo extends FiguraGeometrica {
    private double raio;
    public Circulo() {}
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea() {
        return Math.PI*(Math.pow(raio, 2));
    }
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }
    public double getDiametro() {
        return 2*raio;
    }
}

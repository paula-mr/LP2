package aula12;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula12 {
    public static void main(String[] args) {
        double raio = 5;
        double largura = 5;
        double altura = 3;
        Circulo c = new Circulo(raio);
        JOptionPane.showConfirmDialog(null, "Área do círculo: " + c.getArea()
        + "\nPerímetro do círculo: " + c.getPerimetro());
        Retangulo r = new Retangulo(largura, altura);
        JOptionPane.showConfirmDialog(null, "Área do retângulo: " + r.getArea()
        + "\nPerímetro do retângulo: " + r.getPerimetro());
    }
}

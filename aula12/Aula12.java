package aula12;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula12 {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: ")));
        JOptionPane.showConfirmDialog(null, "Área do círculo: " + c.getArea()
        + "\nPerímetro do círculo: " + c.getPerimetro() + "\nData de criação: " + c.getData());
        Retangulo r = new Retangulo();
        r.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo: ")));
        r.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo: ")));
        JOptionPane.showConfirmDialog(null, "Área do retângulo: " + r.getArea()
        + "\nPerímetro do retângulo: " + r.getPerimetro() + "\nData de criação: " + r.getData());
    }
}

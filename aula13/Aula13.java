package aula13;

import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Aula13 {
    public static void main(String[] args) {
        double x1, x2, x3, x4, y1, y2, y3, y4;
        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo x para o ponto 1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo y para o ponto 1: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo x para o ponto 2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo y para o ponto 2: "));
        x3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo x para o ponto 3: "));
        y3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo y para o ponto 3: "));
        x4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo x para o ponto 4: "));
        y4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a coordenada do eixo y para o ponto 4: "));
        AreaRetangulo r = new AreaRetangulo(x1, y1, x2, y2, x3, y3, x4, y4);
        JOptionPane.showMessageDialog(null, "Área do retângulo é: " + r.area());
    }
}

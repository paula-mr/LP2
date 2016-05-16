package aula13;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aula13 {
    public static void main(String[] args) {
        Voo voo[] = new Voo[2];
        int numVoo;
        String destino;
        double preco;
        int id;
        for (int i=0; i<voo.length; i++) {
            numVoo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do vôo:"));
            destino = JOptionPane.showInputDialog("Digite o destino: ");
            preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da passagem: "));
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identidade do passageiro: "));
            voo[i] = new Passagem(preco, id, numVoo, destino);
        }
        for (int i=0; i<voo.length; i++) {
            JOptionPane.showMessageDialog(null, voo[i].toString());
        }
    }
}

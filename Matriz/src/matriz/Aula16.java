package matriz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Aula16 {
    public static void main(String[] args) {
        //preenche a matriz
        Matriz m = new Matriz(4, 4);
        //determinar numero a ser procurado
        int x = Integer.parseInt(JOptionPane.showInputDialog("Encontrar as ocorrências de: "));
        //transcreve a matriz para o JTextArea
        JTextArea area = new JTextArea();
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                area.append(m.retornaElemento(i, j) + " ");
            }
            area.append("\n");
        }
        //encontra o menor e o maior
        area.append("\nMenor valor " + m.retornaMenor() +
                "\nMaior valor: " + m.retornaMaior() + "\n");
        //encontra as ocorrencias de x
        if (m.contaOcorrencias(x) == 0) {
            area.append("\nNão há ocorrências do número " + x + " na matriz.");
        }
        else if (m.contaOcorrencias(x) == 1) {
            area.append("\nHá uma ocorrência única do número " + x + " na matriz." +
                    m.primeiraOcorrencia(x));
        }
        else {
            area.append("\nA primeira ocorrência de " + x + " é: " + m.primeiraOcorrencia(x) + "\n");
            area.append("\nA última ocorrência de " + x + " é: " + m.ultimaOcorrencia(x) + "\n");
            area.append("\nTodas as ocorrências: " + m.todasOcorrencias(x));
        }
        //cria a janela de exibição
        JFrame frame = new JFrame();
        frame.add(area);
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }  
}

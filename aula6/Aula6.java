package aula6;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula6 {
    public static void main(String[] args) {
        int op;
        //criando alunos
        diário aluno = new diário();
        //criando JTextArea
        JTextArea CaixaSaida = new JTextArea(10, 40);
        CaixaSaida.append("Nome\tConceito\tCondição Final\n");
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        aluno.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: ")));
        aluno.setAulasFrequentadas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de aulas frequentadas pelo aluno: ")));
        aluno.operações();
        CaixaSaida.append(aluno.getNome() + "\t" + aluno.getConceito() + "\t" + aluno.getCondiçãoFinal() + "\n");
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para finalizar"));
        while (op==1) {
            aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
            aluno.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: ")));
            aluno.setAulasFrequentadas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de aulas frequentadas pelo aluno: ")));
            aluno.operações();
            CaixaSaida.append(aluno.getNome() + "\t" + aluno.getConceito() + "\t" + aluno.getCondiçãoFinal() + "\n");
            op=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para finalizar"));
        }
        //criando a JFrame
        JFrame janela = new JFrame("Turma A");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,200);
        janela.setVisible(true);
        janela.add(CaixaSaida);
    }
}

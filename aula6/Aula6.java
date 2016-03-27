package aula6;
import javax.swing.JTextArea;
import javax.swing.JFrame;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula6 {
    public static void main(String[] args) {
        //criando alunos
        diário aluno1 = new diário(50, 92, "João");
        diário aluno2 = new diário(45, 60, "Maria");
        diário aluno3 = new diário(60, 50, "José");
        //criando JTextArea
        JTextArea CaixaSaida = new JTextArea(10, 40);
        CaixaSaida.append("Nome\tConceito\tCondição Final\n");
        CaixaSaida.append(aluno1.getNome() + "\t" + aluno1.getConceito() + "\t" + aluno1.getCondiçãoFinal() + "\n");
        CaixaSaida.append(aluno2.getNome() + "\t" + aluno2.getConceito() + "\t" + aluno2.getCondiçãoFinal() + "\n");
        CaixaSaida.append(aluno3.getNome() + "\t" + aluno3.getConceito() + "\t" + aluno3.getCondiçãoFinal() + "\n");
        //criando a JFrame
        JFrame janela = new JFrame("Turma A");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,200);
        janela.setVisible(true);
        janela.add(CaixaSaida);
        
    }
}

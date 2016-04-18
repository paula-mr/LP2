package Aula9;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Entrevista extends JFrame{
    private Canal canal[] = new Canal[4];
    private Sexo sexo[] = new Sexo[2];
    private Entrevistados entrevistado = new Entrevistados();
    private Resultado resultado;
    private JTextArea area = new JTextArea(150, 50);
    public Entrevista() {
        super("Entrevista");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new FlowLayout());
        //criando os sexos
        sexo[0] = new Sexo("Feminino", entrevistado);
        sexo[1] = new Sexo("Masculino", entrevistado);
        //criando canais
        canal[0] = new Canal(2, entrevistado);
        canal[1] = new Canal(5, entrevistado);
        canal[2] = new Canal(7, entrevistado);
        canal[3] = new Canal(9, entrevistado); 
        //colocando botões
        for (Sexo s : sexo) {
            add(s);
        }
        for (Canal c : canal) {
            add(c);
        }
        resultado = new Resultado(canal, sexo, area);
        add(resultado);
        add(area);
    }
}

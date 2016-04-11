package aula8;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Eleicoes extends JFrame {
    Candidato[] candidatos = new Candidato[6];
    public Eleicoes () {
        super("Eleição");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        setSize(350, 300);
        setLayout(new FlowLayout());
        candidatos[0] = new Candidato("Lulalelé");
        candidatos[1] = new Candidato("Cirogrude");
        candidatos[2] = new Candidato("Criancinha");
        candidatos[3] = new Candidato("Roseaçaí");
        candidatos[4] = new Candidato("Nulo");
        candidatos[5] = new Candidato("Branco");
        for(Candidato cand : candidatos){
            super.add(cand);
        }
        JTextArea areaResultado = new JTextArea(10,10);
        Resultado resultado = new Resultado(candidatos, areaResultado); 
        add(resultado);       
        add(areaResultado);
    }
}

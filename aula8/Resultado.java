
package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Resultado extends JButton {

    private Candidato[] candidatos;
    private JTextArea area;

    public Resultado(Candidato[] candidatos, JTextArea areaResultado) {
        super("Resultado");
        this.candidatos  = candidatos;
        this.area = areaResultado;
        super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = calculaTotalDeVotos();
                Arrays.sort(candidatos, Collections.reverseOrder());
                JOptionPane.showMessageDialog(null,"O Primeiro foi: "+candidatos[0].getNome());
                area.append("O Primeiro foi: "+candidatos[0].getNome());
            }
        });
    }
    
    private int calculaTotalDeVotos() {
        int total = 0;
        for(Candidato cand : candidatos){
            total += cand.getVotos();
        }
        return total;
    }
    
    
}

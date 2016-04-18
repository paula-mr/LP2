package Aula9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Resultado extends JButton {
    private JTextArea area;
    private Canal[] canal;
    private Sexo[] sexo;
    private int totalVotos;
    public Resultado() {}
    public Resultado(Canal[] canal, Sexo[] sexo, JTextArea area) {
        super("Resultado");
        this.canal = canal;
        this.sexo = sexo;
        this.area = area;
        super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                result();
        }
    });
    }
    public void calculaTotal() {
        for (Canal c: canal) {
            totalVotos+=c.getAudiencia();
        }
    }
    public void result() {
        calculaTotal();
        for (Canal c: canal) {
            area.append("Canal " + c.getCanal());
            area.append("\nAudiência: " + ((double)c.getAudiencia()/(double)totalVotos)*100 + '%');
            area.append("\nPorcentagem de mulheres: " + ((double)c.getQuantM()/(double)c.getAudiencia())*100 + '%');
            area.append("\nPorcentagem de homens: " + ((double)c.getQuantH()/(double)c.getAudiencia())*100 + '%' + '\n');
        }
    }
}

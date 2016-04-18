package Aula9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Paula
 */
public class Canal extends JButton{
    private int canal;
    private int audiencia;
    private int quantH, quantM;
    public Canal() {}
    public Canal(int canal, Entrevistados entrevistado) {
        super("CH" + canal);
        audiencia = 0;
        quantH = 0;
        quantM = 0;
        this.canal = canal;
         super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                audiencia++;
                if (entrevistado.getSexo()=="Feminino") {
                    quantM++;
                }
                else {
                    quantH++;
                }
            }
        });
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getQuantH() {
        return quantH;
    }
    public void setQuantH(int quantH) {
        this.quantH = quantH;
    }
    public int getQuantM() {
        return quantM;
    }
    public void setQuantM(int quantM) {
        this.quantM = quantM;
    }
    public int getAudiencia() {
        return audiencia;
    }
    public void setAudiencia(int audiencia) {
        this.audiencia = audiencia;
    }
}

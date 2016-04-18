package Aula9;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Paula
 */
public class Sexo extends JButton {
    private String sexo;
    public Sexo() {}
    public Sexo(String sexo, Entrevistados entrevistado) {
        super(sexo);
        this.sexo = sexo;
        super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrevistado.setSexo(sexo);
            }
        });
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
}

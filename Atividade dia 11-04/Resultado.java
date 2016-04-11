package aula8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Arrays;
//import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class Resultado extends JButton {
    private Candidato[] candidatos;
    private JTextArea area;
    static Candidato classificado;
    static Candidato classificado2; //caso vá para o segundo turno
    public Resultado(Candidato[] candidatos, JTextArea areaResultado) {
        super("Resultado");
        this.candidatos  = candidatos;
        this.area = areaResultado;
        super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado();
                if (classificado2==null) {
                    area.append("Eleição Terminada\nVencendor: " + classificado.getNome());
                }
                else {
                    area.append("Eleição vai para o Segundo Turno\nCandidato 1: " + classificado.getNome() + "\tVotos: " + classificado.getVotos() +
                                "\nCandidato2: " + classificado2.getNome() + "\tVotos: " + classificado2.getVotos());
                }
            }
        });
    }
        public static Candidato getClassificado() {
        return classificado;
    }
    public static void setClassificado(Candidato classificado) {
        Resultado.classificado = classificado;
    }
    public static Candidato getClassificado2() {
        return classificado2;
    }
    public static void setClassificado2(Candidato classificado2) {
        Resultado.classificado2 = classificado2;
    }
    private int calculaTotalDeVotos() {
        int total = 0;
        for(Candidato cand : candidatos){
            total += cand.getVotos();
        }
        return total;
    }
    public void resultado () {
        if (candidatos[0].getVotos()>candidatos[1].getVotos() && candidatos[0].getVotos()>candidatos[2].getVotos() && candidatos[0].getVotos()>candidatos[3].getVotos()) {
            classificado = candidatos[0];
            if (candidatos[1].getVotos()>candidatos[2].getVotos() && candidatos[1].getVotos()>candidatos[3].getVotos()) {
                classificado2 = candidatos[1];
            }
            else {
                if (candidatos[2].getVotos()>candidatos[1].getVotos() && candidatos[2].getVotos()>candidatos[3].getVotos()) {
                    classificado2 = candidatos[2];
                }
                else {
                    if (candidatos[3].getVotos()>candidatos[1].getVotos() && candidatos[3].getVotos()>candidatos[2].getVotos()) {
                        classificado2 = candidatos[3];
                    }
                }
            }
        }
        else {
            if (candidatos[1].getVotos()>candidatos[0].getVotos() && candidatos[1].getVotos()>candidatos[2].getVotos() && candidatos[1].getVotos()>candidatos[3].getVotos()) {
                classificado = candidatos[1];
                if (candidatos[0].getVotos()>candidatos[1].getVotos() && candidatos[0].getVotos()>candidatos[3].getVotos()) {
                    classificado2 = candidatos[0];
                }
                else {
                    if (candidatos[2].getVotos()>candidatos[0].getVotos() && candidatos[2].getVotos()>candidatos[3].getVotos()) {
                        classificado2 = candidatos[2];
                    }
                    else {
                        if (candidatos[3].getVotos()>candidatos[0].getVotos() && candidatos[3].getVotos()>candidatos[2].getVotos()) {
                            classificado2 = candidatos[3];
                        }
                    }
                }
            }
            else {
                if (candidatos[2].getVotos()>candidatos[0].getVotos() && candidatos[2].getVotos()>candidatos[1].getVotos() && candidatos[2].getVotos()>candidatos[3].getVotos()) {
                    classificado = candidatos[2];
                    if (candidatos[0].getVotos()>candidatos[1].getVotos() && candidatos[0].getVotos()>candidatos[3].getVotos()) {
                        classificado2 = candidatos[0];
                    }
                    else {
                        if (candidatos[1].getVotos()>candidatos[0].getVotos() && candidatos[1].getVotos()>candidatos[3].getVotos()) {
                            classificado2 = candidatos[1];
                        }
                        else {
                            if (candidatos[3].getVotos()>candidatos[0].getVotos() && candidatos[3].getVotos()>candidatos[1].getVotos()) {
                                classificado2 = candidatos[3];
                            }
                        }
                    }
                }
                else {
                    if (candidatos[3].getVotos()>candidatos[0].getVotos() && candidatos[3].getVotos()>candidatos[1].getVotos() && candidatos[3].getVotos()>candidatos[1].getVotos()) {
                        classificado = candidatos[3];
                        if (candidatos[0].getVotos()>candidatos[1].getVotos() && candidatos[0].getVotos()>candidatos[2].getVotos()) {
                            classificado2 = candidatos[0];
                        }
                        else {
                            if (candidatos[1].getVotos()>candidatos[0].getVotos() && candidatos[1].getVotos()>candidatos[2].getVotos()) {
                                classificado2 = candidatos[1];
                            }
                            else {
                                if (candidatos[2].getVotos()>candidatos[0].getVotos() && candidatos[2].getVotos()>candidatos[1].getVotos()) {
                                    classificado2 = candidatos[2];
                                }
                            }
                        }
                    }
                }
            }
        }
        if (classificado.getVotos()>calculaTotalDeVotos()/2) {
            classificado2 = null;
        }
    }
}

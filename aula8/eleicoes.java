package aula8;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Paula
 */
public class eleicoes extends JFrame {
    candidato candidato[] = new candidato[4];
    static candidato classificado;
    static candidato classificado2; //caso vá para o segundo turno
    botao nulo;
    botao branco;
    botao resultado;
    static int totalVotos;
    public eleicoes () {
        super("Eleição");
        setLayout( new FlowLayout() );
        candidato[0] = new candidato("Lulalelé");
        candidato[1] = new candidato("Cirogrude");
        candidato[2] = new candidato("Criancinha");
        candidato[3] = new candidato("Roseaçaí");
        nulo = new botao("Nulo");
        branco = new botao("Branco");
        resultado = new botao("Resultado");
        setTotalVotos();
    }
    public eleicoes (candidato candidato1, candidato candidato2, candidato candidato3, candidato candidato4) {
        candidato[0] = candidato1;
        candidato[1] = candidato2;
        candidato[2] = candidato3;
        candidato[3] = candidato4;
        nulo = new botao("Nulo");
        branco = new botao("Branco");
        resultado = new botao("Resultado");
        setTotalVotos();
    }
    public static candidato getClassificado() {
        return classificado;
    }
    public static void setClassificado(candidato classificado) {
        eleicoes.classificado = classificado;
    }
    public static candidato getClassificado2() {
        return classificado2;
    }
    public static void setClassificado2(candidato classificado2) {
        eleicoes.classificado2 = classificado2;
    }
    public static int getTotalVotos() {
        return totalVotos;
    }
    public void setTotalVotos() {
        totalVotos = 0;
    }
    public void resultado () {
        if (candidato[0].getVotos()>candidato[1].getVotos() && candidato[0].getVotos()>candidato[2].getVotos() && candidato[0].getVotos()>candidato[3].getVotos()) {
            classificado = candidato[0];
            if (candidato[1].getVotos()>candidato[2].getVotos() && candidato[1].getVotos()>candidato[3].getVotos()) {
                classificado2 = candidato[1];
            }
            else {
                if (candidato[2].getVotos()>candidato[1].getVotos() && candidato[2].getVotos()>candidato[3].getVotos()) {
                    classificado2 = candidato[2];
                }
                else {
                    if (candidato[3].getVotos()>candidato[1].getVotos() && candidato[3].getVotos()>candidato[2].getVotos()) {
                        classificado2 = candidato[3];
                    }
                }
            }
        }
        else {
            if (candidato[1].getVotos()>candidato[0].getVotos() && candidato[1].getVotos()>candidato[2].getVotos() && candidato[1].getVotos()>candidato[3].getVotos()) {
                classificado = candidato[1];
                if (candidato[0].getVotos()>candidato[2].getVotos() && candidato[0].getVotos()>candidato[3].getVotos()) {
                classificado2 = candidato[0];
                }
                else {
                    if (candidato[2].getVotos()>candidato[0].getVotos() && candidato[2].getVotos()>candidato[3].getVotos()) {
                        classificado2 = candidato[2];
                    }
                    else {
                        if (candidato[3].getVotos()>candidato[0].getVotos() && candidato[3].getVotos()>candidato[2].getVotos()) {
                            classificado2 = candidato[3];
                        }
                    }
                }
            }
            else {
                if (candidato[2].getVotos()>candidato[0].getVotos() && candidato[2].getVotos()>candidato[1].getVotos() && candidato[2].getVotos()>candidato[3].getVotos()) {
                    classificado = candidato[2];
                    if (candidato[0].getVotos()>candidato[1].getVotos() && candidato[0].getVotos()>candidato[3].getVotos()) {
                        classificado2 = candidato[0];
                    }
                    else {
                        if (candidato[1].getVotos()>candidato[0].getVotos() && candidato[1].getVotos()>candidato[3].getVotos()) {
                            classificado2 = candidato[1];
                        }
                        else {
                            if (candidato[3].getVotos()>candidato[0].getVotos() && candidato[3].getVotos()>candidato[1].getVotos()) {
                                classificado2 = candidato[3];
                            }
                        }
                    }   
                }
                else {
                    if (candidato[3].getVotos()>candidato[0].getVotos() && candidato[3].getVotos()>candidato[1].getVotos() && candidato[3].getVotos()>candidato[1].getVotos()) {
                        classificado = candidato[3];
                        if (candidato[0].getVotos()>candidato[1].getVotos() && candidato[0].getVotos()>candidato[2].getVotos()) {
                            classificado2 = candidato[0];
                        }
                        else {
                            if (candidato[1].getVotos()>candidato[0].getVotos() && candidato[1].getVotos()>candidato[2].getVotos()) {
                                classificado2 = candidato[1];
                            }
                            else {
                                if (candidato[2].getVotos()>candidato[0].getVotos() && candidato[2].getVotos()>candidato[1].getVotos()) {
                                    classificado2 = candidato[2];
                                }
                            }
                        }
                    }
                }
            }
        }
        if (classificado.getVotos()>totalVotos/2) {
            classificado2 = null;
        }
    }
}

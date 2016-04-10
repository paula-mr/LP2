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
    static Candidato classificado;
    static Candidato classificado2; //caso vá para o segundo turno
    static int totalVotos;
    public Eleicoes () {
        super("Eleição");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        setSize(500, 500);
        setLayout( new FlowLayout() );
    
        candidatos[0] = new Candidato("Lulalelé");
        candidatos[1] = new Candidato("Cirogrude");
        candidatos[2] = new Candidato("Criancinha");
        candidatos[3] = new Candidato("Roseaçaí");
        candidatos[4] = new Candidato("Nulo");
        candidatos[5] = new Candidato("Branco");
        
        for(Candidato cand : candidatos){
            super.add(cand);
        }
        
        JTextArea areaResultado = new JTextArea(50,50);
        
        Resultado resultado = new Resultado(candidatos, areaResultado); 
        add(resultado);       
        add(areaResultado);

       
        setTotalVotos();
    }
//    public Eleicoes (Candidato candidato1, Candidato candidato2, Candidato candidato3, Candidato candidato4) {
//        candidatos[0] = candidato1;
//        candidatos[1] = candidato2;
//        candidatos[2] = candidato3;
//        candidatos[3] = candidato4;
//        nulo = new Botao("Nulo");
//        branco = new Botao("Branco");
//        resultado = new Botao("Resultado");
//        setTotalVotos();
//    }
    public static Candidato getClassificado() {
        return classificado;
    }
    public static void setClassificado(Candidato classificado) {
        Eleicoes.classificado = classificado;
    }
    public static Candidato getClassificado2() {
        return classificado2;
    }
    public static void setClassificado2(Candidato classificado2) {
        Eleicoes.classificado2 = classificado2;
    }
    public static int getTotalVotos() {
        return totalVotos;
    }
    public void setTotalVotos() {
        totalVotos = 0;
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
                if (candidatos[0].getVotos()>candidatos[2].getVotos() && candidatos[0].getVotos()>candidatos[3].getVotos()) {
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
        if (classificado.getVotos()>totalVotos/2) {
            classificado2 = null;
        }
    }
}

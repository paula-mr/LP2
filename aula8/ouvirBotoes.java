package aula8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Paula
 */
public class ouvirBotoes implements ActionListener {
    candidato[] candidato;
    botao branco;
    botao nulo;
    JTextArea janela;
    public ouvirBotoes() {}
    public ouvirBotoes(candidato[] candidato, botao branco, botao nulo) {
        this.candidato = candidato;
        this.branco = branco;
        this.nulo = nulo;
        janela = new JTextArea();
    }
    public void evento (ActionEvent evento) {
        if (evento.getSource()=="Lulalelé") {
            candidato[0].voto();
        }
        else {
            if (evento.getSource()=="Cirogrude") {
                candidato[1].voto();
            }
            else {
                if (evento.getSource()=="Criancinha") {
                    candidato[2].voto();
                }
                else {
                    if (evento.getSource()=="Roseçaí") {
                        candidato[3].voto();
                    }
                    else {
                        if (evento.getSource()=="Resultado") {
                            if (eleicoes.classificado2!=null) {
                                janela.add(null, "Eleições vão para o segundo turno");
                                janela.append("Candidato" + eleicoes.getClassificado().getNome() +"\tNúmero de votos: " + eleicoes.getClassificado().getVotos());
                                janela.append("Candidato" + eleicoes.getClassificado2().getNome() +"\tNúmero de votos: " + eleicoes.getClassificado2().getVotos());
                            }
                            else {
                                janela.add(null, "Eleições finalizadas");
                                janela.append("Novo presidente: " + eleicoes.getClassificado().getNome());
                            }
                        }
                    }
                }
            }
        }
    }
}

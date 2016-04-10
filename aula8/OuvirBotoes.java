//package aula8;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JTextArea;
//
///**
// *
// * @author Paula
// */
//public class OuvirBotoes implements ActionListener {
//    Candidato[] candidato;
//    Botao branco;
//    Botao nulo;
//    JTextArea janela = new JTextArea();
//    public OuvirBotoes() {}
//    public OuvirBotoes(Candidato[] candidato, Botao branco, Botao nulo) {
//        this.candidato = candidato;
//        this.branco = branco;
//        this.nulo = nulo;
//        janela = new JTextArea();
//    }
//    public void evento (ActionEvent evento) {
//        if (evento.getSource()=="Lulalelé") {
//            candidato[0].adicionaVoto();
//        }
//        else {
//            if (evento.getSource()=="Cirogrude") {
//                candidato[1].adicionaVoto();
//            }
//            else {
//                if (evento.getSource()=="Criancinha") {
//                    candidato[2].adicionaVoto();
//                }
//                else {
//                    if (evento.getSource()=="Roseçaí") {
//                        candidato[3].adicionaVoto();
//                    }
//                    else {
//                        if (evento.getSource()=="Resultado") {
//                            if (Eleicoes.classificado2!=null) {
//                                janela.add(null, "Eleições vão para o segundo turno");
//                                janela.append("Candidato" + Eleicoes.getClassificado().getNome() +"\tNúmero de votos: " + Eleicoes.getClassificado().getVotos());
//                                janela.append("Candidato" + Eleicoes.getClassificado2().getNome() +"\tNúmero de votos: " + Eleicoes.getClassificado2().getVotos());
//                            }
//                            else {
//                                janela.add(null, "Eleições finalizadas");
//                                janela.append("Novo presidente: " + Eleicoes.getClassificado().getNome());
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        evento(e);
//    }
//}

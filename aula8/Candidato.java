package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Candidato extends JButton implements Comparable {
    private String nome;
    private int votos = 0;
    public Candidato () {}
    public Candidato (String nome) {
        super(nome);
        this.nome = nome;
        super.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionaVoto();
//                JOptionPane.showConfirmDialog(null, "Esse candidato tem "+votos);
            }
        });
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }  
    public int getVotos() {
        return votos;
    }
    public void adicionaVoto () {
        votos++;
    }

    @Override
    public int compareTo(Object o) {
        Candidato candidato2 = (Candidato) o;
        Integer numVotosCandidato1 = getVotos();
        Integer numVotosCandidato2 = candidato2.getVotos();
        return numVotosCandidato1.compareTo(numVotosCandidato2);
    }
}

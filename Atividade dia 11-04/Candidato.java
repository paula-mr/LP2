package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Paula
 */
public class Candidato extends JButton {
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
}

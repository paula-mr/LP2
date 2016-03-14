/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Aula4 {
    public static void main(String[] args) {
        // Inicializando os objetos com construtores vazios
        pethouse CaeseGatos = new pethouse();
        cachorro Cachorro1 = new cachorro();
        gato Gato1 = new gato();
        // Atribuindo valor às variáveis de instância do Cachorro
        Cachorro1.setSom("AuAu");
        Cachorro1.setQuantalimentod(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alimento consumida pelo cachorro diariamente:")));
        CaeseGatos.setTempoEstadiaCao(Integer.parseInt(JOptionPane.showInputDialog("Tempo de estadia do cachorro:")));
        // Atribuindo valor às variáveis de instância do Gato
        Gato1.setSom("Miau");
        Gato1.setQuantalimentod(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alimento consumida pelo gato diariamente:")));
        CaeseGatos.setTempoEstadiaGato(Integer.parseInt(JOptionPane.showInputDialog("Tempo de estadia do gato:")));
        // Atribuindo valor às variavéis da pethouse
        CaeseGatos.setNomedaloja("CaeseGatos");
        CaeseGatos.setCachorro(Cachorro1);
        CaeseGatos.setGato(Gato1);
        // Retorna a quantidade total de alimento consumido
        JOptionPane.showMessageDialog(null, "Quantidade de alimento total consumida pelo cachorro: " + CaeseGatos.TotalAlimento(CaeseGatos.getTempoEstadiaCao(), Cachorro1.getQuantalimentod()));
        JOptionPane.showMessageDialog(null, "Quantidade de alimento total consumida pelo gato: " + CaeseGatos.TotalAlimento(CaeseGatos.getTempoEstadiaGato(), Gato1.getQuantalimentod()));
    }
}

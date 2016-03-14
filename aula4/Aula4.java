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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializando os objetos com construtores vazios
        pethouse CaeseGatos = new pethouse();
        cachorro Cachorro1 = new cachorro();
        gato Gato1 = new gato();
        // Atribuindo valor às variáveis de instância do Cachorro
        Cachorro1.setSom("Au");
        Cachorro1.setQuantalimentod(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alimento consumida pelo cachorro diariamente: ")));
        // Atribuindo valor às variáveis de instância do Gato
        Gato1.setSom("Miau");
        Gato1.setQuantalimentod(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alimento consumida pelo gato diariamente: ")));
        //Atribuindo valor às variavéis da pethouse
        CaeseGatos.setNomedaloja("CaeseGatos");
        CaeseGatos.setCachorro(Cachorro1);
        CaeseGatos.setGato(Gato1);
        CaeseGatos.setTempodeestadia(Integer.parseInt(JOptionPane.showInputDialog("Tempo de estadia dos animais:")));
    }
    
}

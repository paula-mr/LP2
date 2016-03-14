/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paralelepípedo p;
        retângulo ret;
        segmento lado1 = new segmento();
        segmento lado2 = new segmento();
        segmento lado3 = new segmento();
        //instancia um retângulo
        lado1.setSeg(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: ")));
        lado2.setSeg(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ")));
        ret = new retângulo(lado1, lado2);
        //pede a profundidade para transformar o retângulo em paralelepípedo
        lado3.setSeg(Integer.parseInt(JOptionPane.showInputDialog("Digite a profundidade: ")));
        p = new paralelepípedo(ret, lado3);
        //imprime o volume e a área externa
        JOptionPane.showMessageDialog(null, "Volume: " + p.volume());
        JOptionPane.showMessageDialog(null, "Área externa: " + p.areaexterna());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Paralelepipedo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paralelepípedo p;
        retângulo ret;
        segmento lado1 = new segmento();
        segmento lado2 = new segmento();
        lado1.setSeg(Integer.parseInt(JOptionPane.showInputDialog("Digite o maior lado: ")));
        lado2.setSeg(Integer.parseInt(JOptionPane.showInputDialog("Digite o menor lado: ")));
        ret = new retângulo(lado1, lado2);
        p = new paralelepípedo(ret);
        JOptionPane.showInternalMessageDialog(null, "Volume:" + p.volume());
    }
    
}

package aula15;

import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Aula15 {
    public static void main(String[] args) {
        Computador c = new Computador(1500, 20, 50, "7.0", "Toshiba");
        Celular cel = new Celular(15, 2000, "IPhone 5s", "Apple");
        Impressora imp = new Impressora(10, 350, "Jato", "8.2", "HP");
        Info i[] = new Info[3];
        i[0] = c;
        i[1] = cel;
        i[2] = imp;
        c.venda();
        c.venda();
        cel.venda();
        for (Info in: i) {
            JOptionPane.showMessageDialog(null, in.toString() + "\n");
        }
    }
}

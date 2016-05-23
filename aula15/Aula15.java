package aula15;

import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Aula15 {
    public static void main(String[] args) {
        int op;
        Computador c = new Computador(1500, 20, 50, "7.0", "Toshiba");
        Celular cel = new Celular(15, 2000, "IPhone 5s", "Apple");
        Celular cel2 = new Celular(15, 1900, "Galaxy s5", "Samsumg");
        Impressora imp = new Impressora(10, 350, "Jato", "8.2", "HP");
        Impressora imp2 = new Impressora(2, 550, "Jato", "10.0", "HP");
        Info i[] = new Info[5];
        i[0] = c;
        i[1] = cel;
        i[2] = cel2;
        i[3] = imp;
        i[4] = imp2;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair\nDigite 1 para comprar um computador Toshiba 7.0"
                + "\nDigite 2 para comprar um IPhone 5s\nDigite 3 para comprar um Samsumg s5\nDigite 4 para comprar uma impressora HP 8.2"
                + "\nDigite 5 para comprar uma impressora HP 10.0"));
        while (op != 0) {
            switch (op) {
                case 1:
                    if (c.getQuantidade()>0) {
                        c.venda();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Não há estoque para o produto");
                    break;
                case 2:
                    if (cel.getQuantidade()>0) {
                        cel.venda();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Não há estoque para o produto");
                    break;
                case 3:
                    if (cel2.getQuantidade()>0) {
                        cel2.venda();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Não há estoque para o produto");
                    break;
                case 4:
                    if (imp.getQuantidade()>0) {
                        imp.venda();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Não há estoque para o produto");
                    break;
               case 5:
                    if (imp2.getQuantidade()>0) {
                        imp2.venda();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Não há estoque para o produto");
                    break;
            }
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair\nDigite 1 para comprar um computador Toshiba 7.0"
                + "\nDigite 2 para comprar um IPhone 5s\nDigite 3 para comprar um Samsumg s5\nDigite 4 para comprar uma impressora HP 8.2"
                + "\nDigite 5 para comprar uma impressora HP 10.0"));
                        
        }
        for (Info in: i) {
            JOptionPane.showMessageDialog(null, in.toString() + "\n");
        }
    }
}
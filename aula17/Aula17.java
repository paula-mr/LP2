package aula17;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Aula17 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome(JOptionPane.showInputDialog(null, "Digite o nome do cachorro: "));
        c.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite idade do cachorro: ")));
        Cavalo cav = new Cavalo();
        cav.setNome(JOptionPane.showInputDialog(null, "Digite o nome do cavalo: "));
        cav.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite idade do cavalo: ")));
        Preguica p = new Preguica();
        p.setNome(JOptionPane.showInputDialog(null, "Digite o nome da preguiça: "));
        p.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite idade da preguiça: ")));
        Animal a[] = new Animal[3];
        a[0] = c;
        a[1] = cav;
        a[2] = p;
        JOptionPane.showMessageDialog(null, "O cachorro faz: " + a[0].emiteSom());
        JOptionPane.showMessageDialog(null, "O cavalo faz: " + a[1].emiteSom());
        JOptionPane.showMessageDialog(null, "A preguiça faz: " + a[2].emiteSom());
    } 
}

package aula8;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Paula
 */
public class botao extends JFrame{
    private JButton botao;
    public botao () {
        botao = new JButton();
    }
    public botao (String name) {
        botao = new JButton(name);
        add(botao);
    }
}

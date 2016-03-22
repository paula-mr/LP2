package jogardados;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class Jogardados {
    public static void main(String[] args) {
        int jogadas=10; //define o número de jogadas
        int pont; //pontuação recebida pelo dado
        //inicializa objetos das classes, sendo 4 jogadores e um dado
        jogador jogador1 = new jogador("João");
        jogador jogador2 = new jogador("Maria");
        jogador jogador3 = new jogador("José");
        jogador jogador4 = new jogador("Ana");
        dado dado = new dado(0, 1, -2, 3, 4, -5);
        for (int i=0; i<jogadas; i++) {
            jogador.proxJogador(jogador1, jogador2, jogador3, jogador4);
            pont=dado.jogar();
            JOptionPane.showMessageDialog(null, "Jogador: " + jogador.proxJogador.nome + "\nPontuação: " + pont);
            jogador.pontuacao(pont, jogador1, jogador2, jogador3, jogador4);
        }
        jogador.ganhador(jogador1, jogador2, jogador3, jogador4);
        JOptionPane.showMessageDialog(null, "Ganhador: " + jogador.ganhador.nome + "\nPontuação: " + jogador.maiorPont);
    }
}

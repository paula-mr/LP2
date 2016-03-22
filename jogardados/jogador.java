package jogardados;
import java.util.Random;

/**
 *
 * @author Paula
 */
public class jogador {
    static jogador proxJogador;
    static jogador ganhador;
    static int maiorPont;
    String nome;
    //incluindo pontuação de cada um dos jogadores
    static int pont1;
    static int pont2;
    static int pont3;
    static int pont4;
    public jogador () {}
    public jogador (String nome) {
        this.nome=nome;
    }
    public static jogador proxJogador(jogador jogador1, jogador jogador2, jogador jogador3, jogador jogador4) {
        Random gerador = new Random();
        int prox = gerador.nextInt(3);
        switch (prox) {
            case 0:
                proxJogador=jogador1;
                break;
            case 1:
                proxJogador=jogador2;
                break;
            case 2:
                proxJogador=jogador3;
                break;
            case 3:
                proxJogador=jogador4;
                break;
        }
        return proxJogador;
    }
    public static void pontuacao (int pont, jogador jogador1, jogador jogador2, jogador jogador3, jogador jogador4) {
        if (proxJogador==jogador1)
            pont1+=pont;
        if (proxJogador==jogador2)
            pont2+=pont;
        if (proxJogador==jogador3)
            pont3+=pont;
        if (proxJogador==jogador4)
            pont4+=pont;
    }
    public static void ganhador (jogador jogador1, jogador jogador2, jogador jogador3, jogador jogador4) {
        if (pont1>pont2 && pont1>pont3 && pont1>pont4) {
            ganhador=jogador1;
            maiorPont=pont1;
        }
        else if (pont2>pont1 && pont2>pont3 && pont2>pont4) {
            ganhador=jogador2;
            maiorPont=pont2;
        }
        else if (pont3>pont1 && pont3>pont2 && pont3>pont4) {
            ganhador=jogador3;
            maiorPont=pont3;
        }
        else if (pont4>pont1 && pont4>pont2 && pont4>pont3) {
            ganhador=jogador1;
            maiorPont=pont4;
        }
    }
}

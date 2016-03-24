package jogardados;
import java.util.Random;

/**
 *
 * @author Paula
 */
public class jogador {
    private String nome;
    private int pont;
    private static jogador proxJogador;
    private static jogador ganhador;
    private static int maiorPont;
    public jogador () {}
    public jogador (String nome) {
        this.nome=nome;
        pont=0;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public static jogador getProxJogador() {
        return proxJogador;
    }
    public static jogador getGanhador() {
        return ganhador;
    }
    public static int getMaiorPont() {
        return maiorPont;
    }
    public int getPont() {
        return pont;
    }
    public static void proxJogador(jogador jogador1, jogador jogador2, jogador jogador3, jogador jogador4) {
        Random gerador = new Random();
        int prox = gerador.nextInt(4);
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
    }
    public static void pontuacao(int pont, jogador jogador1, jogador jogador2, jogador jogador3, jogador jogador4) {
        if (proxJogador==jogador1)
            jogador1.pont+=pont;
        if (proxJogador==jogador2)
            jogador2.pont+=pont;
        if (proxJogador==jogador3)
            jogador3.pont+=pont;
        if (proxJogador==jogador4)
            jogador4.pont+=pont;
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

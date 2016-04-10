package aula8;

/**
 *
 * @author Paula
 */
public class candidato {
    String nome;
    int votos;
    botao botao;
    public candidato () {}
    public candidato (String nome) {
        this.nome = nome;
        botao = new botao(nome);
        votos = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public botao getBotao() {
        return botao;
    }
    public void setBotao(botao botao) {
        this.botao = botao;
    }
    public void setVotos() {
        votos = 0;
    }
    public int getVotos() {
        return votos;
    }
    public void voto () {
        votos++;
    }
}

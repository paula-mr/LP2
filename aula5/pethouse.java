package aula5;
/**
 *
 * @author Paula
 */
public class pethouse {
    String nomeLoja;
    cachorro poodle;
    cachorro viraLata;
    cachorro dogAlemao;
    public pethouse() {}
    public pethouse(String nomeLoja, cachorro poodle, cachorro viraLata, cachorro dogAlemao) {
        this.nomeLoja = nomeLoja;
        this.poodle = poodle;
        this.viraLata = viraLata;
        this.dogAlemao = dogAlemao;
    }
    public String getNomeLoja() {
        return nomeLoja;
    }
    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
    public cachorro getPoodle() {
        return poodle;
    }
    public void setPoodle(cachorro poodle) {
        this.poodle = poodle;
    }
    public cachorro getViraLata() {
        return viraLata;
    }
    public void setViraLata(cachorro viraLata) {
        this.viraLata = viraLata;
    }
    public cachorro getDogAlemao() {
        return dogAlemao;
    }
    public void setDogAlemao(cachorro dogAlemao) {
        this.dogAlemao = dogAlemao;
    }
    public void comer() {
        poodle.alimento();
        viraLata.alimento();
        dogAlemao.alimento();
    }
}

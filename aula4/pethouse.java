/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Paula
 */
public class pethouse {
    cachorro Cachorro;
    gato Gato;
    String nomedaloja;
    int tempodeestadia;
    public pethouse() {}
    public pethouse(cachorro Cachorro, gato Gato, String nomedaloja, int tempodeestadia) {
        this.Cachorro = Cachorro;
        this.Gato = Gato;
        this.nomedaloja = nomedaloja;
        this.tempodeestadia = tempodeestadia;
    }
    public cachorro getCachorro() {
        return Cachorro;
    }
    public void setCachorro(cachorro Cachorro) {
        this.Cachorro = Cachorro;
    }
    public gato getGato() {
        return Gato;
    }
    public void setGato(gato Gato) {
        this.Gato = Gato;
    }
    public String getNomedaloja() {
        return nomedaloja;
    }
    public void setNomedaloja(String nomedaloja) {
        this.nomedaloja = nomedaloja;
    }
    public int getTempodeestadia() {
        return tempodeestadia;
    }
    public void setTempodeestadia(int tempodeestadia) {
        this.tempodeestadia = tempodeestadia;
    }
}

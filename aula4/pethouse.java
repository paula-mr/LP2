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
    int TempoEstadiaGato;
    int TempoEstadiaCao;
    public pethouse() {}
    public pethouse(cachorro Cachorro, gato Gato, String nomedaloja, int TempoEstadiaGato, int TempoEstadiaCao) {
        this.Cachorro = Cachorro;
        this.Gato = Gato;
        this.nomedaloja = nomedaloja;
        this.TempoEstadiaCao = TempoEstadiaCao;
        this.TempoEstadiaGato = TempoEstadiaGato;
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
    public int getTempoEstadiaCao() {
        return TempoEstadiaCao;
    }
    public void setTempoEstadiaCao(int TempoEstadiaCao) {
        this.TempoEstadiaCao = TempoEstadiaCao;
    }
    public int getTempoEstadiaGato() {
        return TempoEstadiaGato;
    }
    public void setTempoEstadiaGato(int TempoEstadiaGato) {
        this.TempoEstadiaGato = TempoEstadiaGato;
    }
    public double TotalAlimento(int TempoEstadia, double quantalimentod) {
        return (double)TempoEstadia*quantalimentod;
    }
}

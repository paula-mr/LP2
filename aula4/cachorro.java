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
public class cachorro {
    String nome;
    String som;
    double quantalimentod;
    public cachorro() {}
    public cachorro(String nome, String som, double quantalimentod) {
        this.nome = nome;
        this.som = som;
        this.quantalimentod = quantalimentod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public double getQuantalimentod() {
        return quantalimentod;
    }
    public void setQuantalimentod(double quantalimentod) {
        this.quantalimentod = quantalimentod;
    }
}

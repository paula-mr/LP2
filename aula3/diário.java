/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Paula Ribeiro
 */
public class diário {
    int aulasfrequentadas;
    double nota, frequencia;
    String condiçãofinal;
    //construtor vazio
    public diário () {
    }
    //construtor com parâmetros
    public diário (int AulasFrequentadas, double Nota) {
        aulasfrequentadas = AulasFrequentadas;
        nota = Nota;
    }
    void setAulasfrequentadas (int AulasFrequentadas) {
        aulasfrequentadas=AulasFrequentadas;
    }
    int getAulasfrequentadas () {
        return aulasfrequentadas;
    }
    void setNota (double Nota) {
        nota=Nota;
    }
    double getNota () {
        return nota;
    }
    void setFrequencia () {
        frequencia=(aulasfrequentadas/60.0)*100.0;
    }
    double getFrequencia () {
        return frequencia;
    }
    void setCondiçãofinal () {
        if (nota>=60 && frequencia>=75) {
            condiçãofinal="Aprovado";
        }
        else {
            condiçãofinal="Reprovado";
        }
    }
    String getCondiçãofinal () {
        return condiçãofinal;
    }
}

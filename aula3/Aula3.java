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
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        diário d1 = new diário(40, 60);
    //    d1.setNota(80);
    //    d1.setAulasfrequentadas(55);
        d1.setFrequencia();
        d1.setCondiçãofinal();
        System.out.println(d1.getCondiçãofinal());
    }
    
}

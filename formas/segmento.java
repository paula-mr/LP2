/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author Paula Ribeiro
 */
public class segmento {
    private double seg;
    public segmento() {}
    public segmento (double seg) {
        setSeg(seg);
    }
    public void setSeg(double seg) {
        if (seg>0)
            this.seg=seg;
    }
    public double getSeg() {
        return seg;
    }
    public String Tostring() {
        return "Segmento de reta: " + seg;
    }
}

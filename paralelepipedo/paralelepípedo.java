/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;

/**
 *
 * @author Paula Ribeiro
 */
public class paralelepípedo {
    private retângulo ret;
    private segmento profund;
    public paralelepípedo () {
        ret = new retângulo();
        profund = new segmento();
    }
    public paralelepípedo (retângulo ret, segmento profund) {
        setRet(ret);
        this.profund = profund;
    }
    public void setRet (retângulo ret) {
        this.ret = ret;
    }
    public retângulo getRet() {
        return ret;
    }
    public segmento getProfund() {
        return profund;
    }
    public void setProfund(segmento profund) {
        this.profund = profund;
    }
    public double areaexterna() {
        double l1 = ret.getLado1();
        double l2 = ret.getLado2();
        double p = profund.getSeg();
        double areae = (4*l1*l2 + 2*l2*l1);
        return areae;
    }
    public double volume() {
        double a = ret.area();
        double p = profund.getSeg();
        return a*p;
    }
}

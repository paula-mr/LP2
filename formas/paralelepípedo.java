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
        double comp = ret.getLado1().getSeg();
        double p = profund.getSeg();
        double alt = ret.getLado2().getSeg();
        double areae = 2*(comp*alt+p*alt+comp*p);
        return areae;
    }
    public double volume() {
        double a = ret.area();
        double p = profund.getSeg();
        return a*p;
    }
}

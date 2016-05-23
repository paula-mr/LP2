package aula15;

/**
 *
 * @author Paula
 */
public abstract class Info implements Produtos {
    protected String modelo;
    protected String marca;
    public Info () {}
    public Info(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }   
}
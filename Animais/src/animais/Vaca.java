package animais;

/**
 *
 * @author Paula
 */
public class Vaca extends Animal{
    private String som;
    private String comida;
    private String raca;
    public Vaca() {}
    public Vaca(String nome, int idade) {
        super(nome, idade);
        this.som = "muuu";
        comida = "campim";
        raca = "holandesa";
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public String getComida() {
        return comida;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public String toString() {
        return super.toString() + " Som: " + getSom() + " Comida: " + getComida() + " Raça : " + getRaca();
    }
}

package estudoparaprova;

/**
 *
 * @author Paula
 */
public class Moto extends Veiculo{
    private int cilindrada;

    public Moto() {}

    public Moto(int cilindrada, int chassi, String anoFabricacao, double velocidade) {
        super(chassi, anoFabricacao, velocidade);
        this.cilindrada = cilindrada;
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String deveEquilibrar() {
        return "Em equilíbrio";
    }
}

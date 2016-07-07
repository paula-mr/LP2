package estudoparaprova;

/**
 *
 * @author Paula
 */
public class Carro extends Veiculo {
    private int numPassageiros;

    public Carro() {}
   
    public Carro(int numPassageiros, int chassi, String anoFabricacao, double velocidade) {
        super(chassi, anoFabricacao, velocidade);
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
}

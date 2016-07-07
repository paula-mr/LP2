package estudoparaprova;

/**
 *
 * @author Paula
 */
public abstract class Veiculo implements VerificaVelocidade {
    protected int chassi;
    protected String anoFabricacao;
    protected double velocidade;
    public Veiculo() {}
    public Veiculo(int chassi, String anoFabricacao, double velocidade) {
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = velocidade;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
    public String verificaVelocidade() {
        try {
            if (velocidade > 99)
                throw new Excecao("Velocidade fora dos limites permitidos!");
        } catch (Excecao e) {
            velocidade = 99;
        }
        if (velocidade > 80)
            return "Velocidade alta";
        else if (velocidade > 30)
            return "Velocidade média";
        else
            return "Velocidade baixa";
    }
}

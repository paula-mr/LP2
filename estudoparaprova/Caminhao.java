package estudoparaprova;

/**
 *
 * @author Paula
 */
public class Caminhao extends Veiculo{
    private int cargaMaxima;
    private int carga;

    public Caminhao() {}

    public Caminhao(int cargaMaxima, int carga, int chassi, String anoFabricacao, double velocidade) {
        super(chassi, anoFabricacao, velocidade);
        this.cargaMaxima = cargaMaxima;
        this.carga = carga;
    }


    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public String verificaCarga() {
        try {
            if (carga>cargaMaxima)
                throw new Excecao("Sobrecarga");
        }
        catch (Excecao e) {
            carga = cargaMaxima;
        }
        return "Carga dentro do permitido";
    }
}

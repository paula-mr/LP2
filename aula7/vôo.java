package aula7;

/**
 *
 * @author Paula Ribeiro
 */
public class vôo {
    int numVoo;
    int tipoAvião;
    int preço;
    int capacidade;
    int reservas;
    passageiro passageiro[];
    public vôo(){
    }
    public vôo(int numVoo, int tipoAvião, int preço) {
        this.numVoo = numVoo;
        this.tipoAvião = tipoAvião;
        this.preço = preço;
        setCapacidade();
    }
    public int getNumVoo() {
        return numVoo;
    }
    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }
    public int getTipoAvião() {
        return tipoAvião;
    }
    public void setTipoAvião(int tipoAvião) {
        this.tipoAvião = tipoAvião;
        setCapacidade();
        passageiro = new passageiro[capacidade];
    }
    public int getPreço() {
        return preço;
    }
    public void setPreço(int preço) {
        this.preço = preço;
    }
    public passageiro getPassageiro() {
        return passageiro[reservas];
    }
    public void setPassageiro(passageiro p) {
        passageiro[reservas] = p;
    }
    public int getReservas() {
        return reservas;
    }
    public void setReservas() {
        reservas = 0;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade() {
        if(getTipoAvião()==707) {
            capacidade=10;
        }
        else {
            if(getTipoAvião()==727) {
                capacidade=7;
            }
            else {
                if(getTipoAvião()==737) {
                    capacidade=2; //mudar pra 5
                }
            }
        }
    }
    public boolean checkCapacidade() {
        return reservas<capacidade;
    }
    public void reservas() {
        reservas++;
    }
}

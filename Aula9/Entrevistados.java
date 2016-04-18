package Aula9;

/**
 *
 * @author Paula
 */
public class Entrevistados {
    private String sexo;
    private int canal; // canal assistido
    public Entrevistados() {}
    public Entrevistados (Sexo sexo, int canal) {
        this.sexo = sexo.getSexo();
        this.canal = canal;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setCanal(Canal canal) {
        this.canal = canal.getCanal();
    }
    public int getCanal() {
        return canal;
    }
}

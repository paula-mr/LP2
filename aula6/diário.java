package aula6;

/**
 *
 * @author Paula Ribeiro
 */
public class diário {
    int aulasFrequentadas;
    double nota;
    double frequencia;
    String condiçãoFinal;
    String nome;
    String conceito;
    public diário() {}
    public diário(int aulasFrequentadas, double nota, String nome) {
        this.aulasFrequentadas = aulasFrequentadas;
        this.nota = nota;
        this.nome = nome;
        Frequencia();
        Conceito();
        CondiçãoFinal();
    }
    public int getAulasFrequentadas() {
        return aulasFrequentadas;
    }
    public void setAulasFrequentadas(int aulasFrequentadas) {
        this.aulasFrequentadas = aulasFrequentadas;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getFrequencia() {
        return frequencia;
    }
    public void Frequencia() {
        frequencia=((double)aulasFrequentadas/60.0)*100.0;
    }
    public String getCondiçãoFinal() {
        return condiçãoFinal;
    }
    public void CondiçãoFinal() {
        if (nota>=60 && frequencia>=75)
            condiçãoFinal="Aprovado";
        else
            condiçãoFinal="Reprovado";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConceito() {
        return conceito;
    }
    public void Conceito() {
        if (frequencia<75)
            conceito="F";
        else {
            switch ((int)nota/10){
                case 10:
                    conceito="A+";
                    break;
                case 9:
                    conceito="A";
                    break;
                case 8:
                    conceito="B";
                    break;
                case 7:
                    conceito="C";
                    break;
                case 6:
                    conceito="D";
                    break;
                default:
                    conceito="F";
                    break;
            }
        }
    }
}
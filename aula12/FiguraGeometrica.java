package aula12;

/**
 *
 * @author Paula Ribeiro
 */
public class FiguraGeometrica {
    protected String cor;
    protected boolean preenche;
    protected java.util.Date dataCriacao;
    public FiguraGeometrica() {
        dataCriacao = new java.util.Date();
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean estaPreenche() {
        return preenche;
    }
    public void setPreenche(boolean preenche) {
        this.preenche = preenche;
    }
    public java.util.Date getData() {
        return dataCriacao;
    }
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

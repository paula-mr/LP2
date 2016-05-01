package aula13;

/**
 *
 * @author Paula
 */
public class AreaRetangulo extends OpAvancado {
    double x1, x2, x3, x4, y1, y2, y3, y4;
    private double comp;
    private double altura;
    public AreaRetangulo(){}
    public AreaRetangulo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        comp = OpAvancado.distancia(x1, x2, y1, y2);
        altura = OpAvancado.distancia(x1, x3, y1, y3);
    }
    public double getComp() {
        return comp;
    }
    public double getAltura() {
        return altura;
    }
    public double area() {
        return (comp*altura);
    }
}

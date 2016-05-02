package aula13;

/**
 *
 * @author Paula
 */
public class OpAvancado extends OpBasico {
    public OpAvancado(){}
    public static double potencia (int x, int y) {
        return Math.pow(x, y);
    }
    public static double potencia (double x, int y) {
        return Math.pow(x, y);
    }
    public static int fatorial (int x) {
        int fat = 1;
        for (int i=1; i<=x; i++) {
            fat = mult (fat, i);
        }
        return fat;
    }
    public static double distancia (double x1, double x2, double y1, double y2) {
        return Math.sqrt(soma(potencia((x2-x1), 2), potencia((y2-y1), 2)));
    }
}

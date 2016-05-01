package aula13;

/**
 *
 * @author Paula
 */
public class OpAvancado extends OpBasico {
    public OpAvancado(){}
    public static int potencia (double x, int y) {
        int pot = 1;
        for (int i=0; i<y; i++) {
            pot *= x;
        }
        return pot;
    }
    public static int fatorial (int x) {
        int fat = 1;
        for (int i=1; i<=x; i++) {
            fat *= i;
        }
        return fat;
    }
    public static double distancia (double x1, double x2, double y1, double y2) {
        return Math.sqrt(potencia((x2-x1), 2) + potencia((y2-y1), 2));
    }
}

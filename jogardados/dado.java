package jogardados;

import java.util.Random;

/**
 *
 * @author Paula
 */
public class dado {
    private int face1;
    private int face2;
    private int face3;
    private int face4;
    private int face5;
    private int face6;
    public dado () {}
    public dado(int face1, int face2, int face3, int face4, int face5, int face6) {
        this.face1 = face1;
        this.face2 = face2;
        this.face3 = face3;
        this.face4 = face4;
        this.face5 = face5;
        this.face6 = face6;
    }
    public int getFace1() {
        return face1;
    }
    public int getFace2() {
        return face2;
    }
    public int getFace3() {
        return face3;
    }
    public int getFace4() {
        return face4;
    }
    public int getFace5() {
        return face5;
    }
    public int getFace6() {
        return face6;
    }
    public int jogar() {
        Random gerador = new Random();
        int face = gerador.nextInt(5); //gerará a face do dado a cair
        int pont=0;
        switch (face) {
            case 0:
                pont=getFace1();
                break;
            case 1:
                pont=getFace2();
                break;
            case 2:
                pont=getFace3();
                break;
            case 3:
                pont=getFace4();
                break;
            case 4:
                pont=getFace5();
                break;
            case 5:
                pont=getFace6();
                break;
        }
        return pont;
    }
}

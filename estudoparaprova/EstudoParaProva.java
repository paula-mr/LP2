package estudoparaprova;

/**
 *
 * @author Paula
 */
public class EstudoParaProva {
    public static void main(String[] args) {
        int tamanho = 5;
        Veiculo v[] = new Veiculo[tamanho];
        try {
            v[0] = new Carro(5, 102, "2016", 81);
            v[1] = new Carro(5, 26527, "2010", 113);
            v[2] = new Moto(95, 920189, "2002", 50);
            v[3] = new Caminhao(15000, 20000, 4322243, "2001", 30);
            v[4] = new Caminhao(22000, 20000, 73829, "2007", 80);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estouro de vetor");
        }
        for (Veiculo i : v) {
            if (i instanceof Caminhao) {
                ((Caminhao) i).verificaCarga();
                System.out.println("Caminhão de carga: " + ((Caminhao) i).getCarga());
            }
        }
    }
    
}

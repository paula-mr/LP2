package matriz;

import java.util.Random;

/**
 *
 * @author Paula
 */
public class Matriz {
    private int linha, coluna;
    private int[][] matriz;
    public Matriz () {}
    public Matriz (int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        matriz = new int[linha][coluna];
        inicializaMatriz();
    }
    public void inicializaMatriz() {
        for (int i=0; i<linha; i++) {
            try {    
                for (int j=0; j<coluna; j++) {
                    Random rand = new Random();
                    matriz[i][j] = rand.nextInt(15);
                    while (matriz[i][j] == 0) {
                        try {    
                            if (matriz[i][j] == 0)
                                throw new excecao("Número não pode ser 0!");
                        } catch (excecao e) {
                            System.out.println("erro: " + e);
                            matriz[i][j] = rand.nextInt(15);
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("erro: " + e);
            }
        }
    }
    public int getLinha() {
        return linha;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public int getColuna() {
        return coluna;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public int retornaElemento(int linha, int coluna) {
        try {    
            return matriz[linha][coluna];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
            return 0;
        }
    }
    public int retornaMenor() {
        int menor = 1000;
        for (int i=0; i<linha; i++) {
            for (int j=0; j<coluna; j++) {
                try {    
                    if (matriz[i][j] < menor)
                        menor = matriz[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            }
        }
        return menor;
    }
    public int retornaMaior() {
        int maior = 0;
        for (int i=0; i<linha; i++) {
            for (int j=0; j<coluna; j++) {
                try {
                    if (matriz[i][j] > maior)
                        maior = matriz[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            }
        }
        return maior;
    }
    public String primeiraOcorrencia(int x) {
        int linhaOcor = -1, colunaOcor = -1;
        boolean notFound = true;
        int i = 0, j = 0;
        for (i=0; i<linha && notFound; i++) {
            for (j=0; j<coluna && notFound; j++) {
                try {    
                    if (matriz[i][j] == x) {
                        linhaOcor = i;
                        colunaOcor = j;
                        notFound = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            } 
        }
        return "\nLinha: " + (linhaOcor+1) + "\nColuna: " + (colunaOcor+1);
    }
    public String ultimaOcorrencia(int x) {
        int linhaOcor = -1, colunaOcor = -1;
        int i = 0, j = 0;
        for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
                try {
                    if (matriz[i][j] == x) {
                        linhaOcor = i;
                        colunaOcor = j;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            } 
        }
        return "\nLinha: " + (linhaOcor+1) + "\nColuna: " + (colunaOcor+1);
    }
    public String todasOcorrencias(int x) {
        int linhaOcor = -1, colunaOcor = -1;
        String resposta = "";
        int i = 0, j = 0;
        for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
                try {
                    if (matriz[i][j] == x) {
                        resposta += "\nLinha: " + (i+1) + "; Coluna: " + (j+1);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            } 
        }
        resposta += "\n";
        return resposta;
    }
    public int contaOcorrencias(int x) {
        int cont = 0;
        int i = 0, j = 0;
        for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
                try {    
                    if (matriz[i][j] == x) {
                        cont++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("erro: " + e);
                }
            } 
        }
        return cont;
    }
}
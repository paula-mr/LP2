package aula5;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Paula
 */
public class Aula5 {
    public static void main(String[] args) {
        //modo de mostrar apenas uma casa decimal:
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        //inicializando objetos
        cachorro poodle = new cachorro();
        cachorro dogAlemao = new cachorro();
        cachorro viraLata = new cachorro();
        pethouse CaesEGatos = new pethouse("CaesEGatos", poodle, viraLata, dogAlemao);
        //inicializando a quantidade diária de ração que cada cachorro consome
        poodle.setQuantAlimentoD(0.1);
        dogAlemao.setQuantAlimentoD(0.8);
        viraLata.setQuantAlimentoD(0.3);
        //variável para simulação de dias
        int dias=3;
        //simulação para a quantidade de alimentos depois de 3 dias
        for (int i=0; i<dias; i++) {
            CaesEGatos.comer();
        }
        //imprimindo a quantidade de ração
        JOptionPane.showMessageDialog(null, "Quantidade de ração após três dias: " + numberFormat.format(cachorro.getQuantRacao()) + "kg");
    }
}

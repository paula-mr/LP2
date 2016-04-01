package aula7;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula7 {
    public static void main(String[] args) {
        int numVoos=2;
        passageiro p = new passageiro();
        vôo voo[] = new vôo[numVoos];
        //cria os vôos
        for (int i=0; i<numVoos; i++) { //mudar para 5
            voo[i] = new vôo();
            voo[i].setNumVoo(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do vôo:")));
            voo[i].setTipoAvião(Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de avião utilizado:")));
            voo[i].setPreço(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço da passagem:")));
        }
        //recebe os pedidos de reserva
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a identidade:")));
        while (p.getId()!=0) {
            p.setVoo(Integer.parseInt(JOptionPane.showInputDialog("Digite o vôo desejado: ")));
            //encontra o vôo desejado
            for (int i=0; i<numVoos; i++) {
                if (voo[i].getNumVoo()==p.getVoo()) {
                    if(voo[i].checkCapacidade()) {
                        voo[i].setPassageiro(p);
                        JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() +"\nPreço da passagem: " 
                        + voo[i].getPreço() + "\nRESERVA CONFIRMADA");
                        voo[i].reservas();
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() + "\nVÔO LOTADO");
                    }
                }
            }
            p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a identidade:")));
        }    
    }
}

package aula7;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula Ribeiro
 */
public class Aula7 {
    public static void main(String[] args) {
        passageiro p = new passageiro();
        vôo voo[] = new vôo[2];
        //cria os vôos
        for (int i=0; i<1; i++) { //mudar para 5
            voo[i] = new vôo();
            voo[i].setNumVoo(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do vôo:")));
            voo[i].setTipoAvião(Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de avião utilizado:")));
            voo[i].setPreço(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço da passagem:")));
        }
        //recebe os pedidos de reserva
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a identidade:")));
        p.setVoo(Integer.parseInt(JOptionPane.showInputDialog("Digite o vôo desejado: ")));
        //encontra o vôo desejado
        int i;
        for(i=0; i<2 && voo[i].getNumVoo()!=p.getVoo(); i++) {}
            if(voo[i].checkCapacidade()) {
                voo[i].setPassageiro(p);
                JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() +"\nPreço da passagem" 
                + voo[i].getPreço() + "\nRESERVA CONFIRMADA");
                voo[i].reservas();
            }
            else {
                JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() + "\nVÔO LOTADO");
            }
        /*while (p.getId()!=0) {
            p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a identidade:")));
            p.setVoo(Integer.parseInt(JOptionPane.showInputDialog("Digite o vôo desejado: ")));
            //encontra o vôo desejado
            for (int i=0; i<2; i++) {
                if (p.getVoo()==voo[i].getNumVoo()) {
                    //checa a disponibilidade para tal vôo
                    voo[i].disponibilidade(p);
                    //checa se reserva foi efetuada
                    if (p==voo[i].getPassageiro()) {
                        JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() +"\nPreço da passagem" 
                        + voo[i].getPreço() + "\nRESERVA CONFIRMADA");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Identidade: " + p.getId() + "\nVôo: " + p.getVoo() + "\nVÔO LOTADO");
                    }
                }
            }
        }
*/
    }
}


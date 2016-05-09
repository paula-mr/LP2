package aulaabstrata;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AulaAbstrata {
    public static void main(String[] args) {
        //criar professor
        Professor p = new Professor();
        Professor undefined = new Professor();
        p.setNome("José Wilson");
        p.setMatricula(1);
        p.setIdentidade(1);
        //criar disciplinas
        Disciplina[] d = new Disciplina[5];
        d[0] = new Disciplina("LPII", 1, p);
        d[1] = new Disciplina("Matemática", 2, undefined);
        d[2] = new Disciplina("Física", 3, undefined);
        d[3] = new Disciplina("Química", 4, undefined);
        d[4] = new Disciplina("Biologia", 5, undefined);
        //seta a disciplina do professor
        p.setDisciplina(d[0]);
        //criar alunos
        Aluno[] a = new Aluno[10];
        a[0] = new Aluno(1, d, "João", 1);
        a[1] = new Aluno(2, d, "José", 2);
        a[2] = new Aluno(3, d, "Joana", 3);
        a[3] = new Aluno(4, d, "Maria", 4);
        a[4] = new Aluno(5, d, "Ana", 5);
        a[5] = new Aluno(6, d, "Paula", 6);
        a[6] = new Aluno(7, d, "Gabriel", 7);
        a[7] = new Aluno(8, d, "Victor", 8);
        a[8] = new Aluno(9, d, "Marcelo", 9);
        a[9] = new Aluno(10, d, "Thales", 10);
        JOptionPane.showMessageDialog(null, p.toString());
        for(int i=0; i<10; i++) {
            JOptionPane.showMessageDialog(null, a[i].toString());
        }
    }
}

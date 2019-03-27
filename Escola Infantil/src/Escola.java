import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turma;
    private List<professor> professores;

    public Escola() {
        turma = new ArrayList();
        professores = new ArrayList();
    }

    public void getTurma() {
        for(Turma t:turma) {
            System.out.println(t.getNome_turma());
        }
    }

    public void setTurma(Turma t) {
        turma.add(t);
    }

    public void getProfessores() {
        for(professor p:professores) {
            System.out.println(p.getNome());
        }
    }

    public void setProfessores(professor p) {
        professores.add(p);
    }
}

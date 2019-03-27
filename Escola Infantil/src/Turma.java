import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int cod,sala;
    private String nome_turma;
    private char tipo;
    //private horario;
    private List<aluno> lista_alunos = new ArrayList();

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setLista_alunos(aluno a) {
        lista_alunos.add(a);
    }

    public void getLista_alunos() {
        for(aluno a1:lista_alunos) {
            System.out.println(a1.getMatricula() + " " +a1.getNome());
        }
    }

    public Turma(int cod, int sala, String nome_turma, char tipo) {
        this.cod = cod;
        this.sala = sala;
        this.nome_turma = nome_turma;
        this.tipo = tipo;
    }
}

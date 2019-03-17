public class professor{
    private String instrucao;
    private double salario_base;
    private String nome;
    private int matricula;

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public professor(String instrucao, double salario_base, String nome, int matricula) {
        this.instrucao = instrucao;
        this.salario_base = salario_base;
        this.nome = nome;
        this.matricula = matricula;
    }
}

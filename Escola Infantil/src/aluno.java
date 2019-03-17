public class aluno{
    private String nome_mae;
    private int dia,mes,ano;
    private String nome;
    private int matricula;

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public void getData() {
        System.out.println("Dia: "+dia+". Mes: "+mes+". Ano: "+ano+".");
    }

    public void setData(int dia,int mes,int ano) {
        if((dia >= 1 && dia <= 31) && (mes >= 1 && mes<=12) && ano>0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
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

    public aluno(String nome, int matricula, String nome_mae, int dia, int mes, int ano) {
        this.nome = nome;
        this.matricula = matricula;
        this.nome_mae = nome_mae;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}

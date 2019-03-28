public class teste {
    public static void main(String[] args) {
        Escola e = new Escola();
        Turma t = new Turma(1,22,"Pre",'A');
        aluno a = new aluno("Pedro",201,"Maria",21,10,2000);
        professor p = new professor("Doutorado",10000,"Celso",98012);
        t.setLista_alunos(a);
        t.getLista_alunos();
        t.setProf(p);
        System.out.println(t.getProf());
        System.out.println(t.getCod());
        System.out.println(t.getSala());
        System.out.println(t.getTipo());
        e.setProfessores(p);
        e.setTurma(t);
        e.getTurma();
    }
}
